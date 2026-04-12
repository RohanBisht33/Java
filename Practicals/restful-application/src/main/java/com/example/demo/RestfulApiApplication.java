package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

// ================= MAIN =================
@SpringBootApplication
public class RestfulApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestfulApiApplication.class, args);
    }
}

// ================= MODEL =================
class Student {
    private int id;
    private String name;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// ================= REPOSITORY =================
@Repository
class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        return students;
    }

    public void save(Student s) {
        students.add(s);
    }

    public void delete(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public Optional<Student> findById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }
}

// ================= SERVICE =================
@Service
class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public boolean deleteStudent(int id) {
        Optional<Student> s = repo.findById(id);
        if (s.isPresent()) {
            repo.delete(id);
            return true;
        }
        return false;
    }

    public boolean updateStudent(int id, Student newData) {
        Optional<Student> optional = repo.findById(id);
        if (optional.isPresent()) {
            Student s = optional.get();
            s.setName(newData.getName());
            return true;
        }
        return false;
    }
}

// ================= CONTROLLER =================
@RestController
@RequestMapping("/api/students")   // 🔥 RESTful path
class StudentController {

    @Autowired
    private StudentService service;

    // GET all students
    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    // POST add student
    @PostMapping
    public String addStudent(@RequestBody Student s) {
        service.addStudent(s);
        return "Student Added Successfully";
    }

    // DELETE student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = service.deleteStudent(id);
        return removed ? "Deleted Successfully" : "Student Not Found";
    }

    // PUT update student
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student s) {
        boolean updated = service.updateStudent(id, s);
        return updated ? "Updated Successfully" : "Student Not Found";
    }
}