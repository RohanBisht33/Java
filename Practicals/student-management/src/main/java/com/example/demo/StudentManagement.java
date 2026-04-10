package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

// ================= MAIN =================
@SpringBootApplication
public class StudentManagement {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagement.class, args);
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
    public String getName() { return name; }
}

// ================= REPOSITORY =================
@Repository
class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getAll() {
        return students;
    }

    public void add(Student s) {
        students.add(s);
    }
}

// ================= SERVICE =================
@Service
class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getStudents() {
        return repo.getAll();
    }

    public void addStudent(int id, String name) {
        repo.add(new Student(id, name));
    }
}

// ================= CONTROLLER =================
@RestController
@RequestMapping("/students")
class StudentController {

    @Autowired
    private StudentService service;

    // Home page (simple UI)
    @GetMapping("/home")
    public String home() {
        return """
        <h2>Student Management System</h2>
        <form action="/students/add">
            ID: <input type="number" name="id"/><br/>
            Name: <input type="text" name="name"/><br/>
            <input type="submit" value="Add Student"/>
        </form>
        <br/>
        <a href="/students">View All Students</a>
        """;
    }

    // Add student (via browser)
    @GetMapping("/add")
    public String add(@RequestParam int id, @RequestParam String name) {
        service.addStudent(id, name);
        return "<h3>Student Added!</h3><a href='/students/home'>Go Back</a>";
    }

    // View all students
    @GetMapping
    public String view() {
        List<Student> list = service.getStudents();

        StringBuilder sb = new StringBuilder("<h2>Students List</h2>");
        for (Student s : list) {
            sb.append("ID: ").append(s.getId())
              .append(" | Name: ").append(s.getName())
              .append("<br/>");
        }
        sb.append("<br/><a href='/students/home'>Go Back</a>");
        return sb.toString();
    }
}