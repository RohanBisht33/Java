//This is a comment
//----------------------------------------------------------
//class is a keyword

class Student {

    private String name;   // hidden

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

//Class name (Main) is Capitalized form of main.java
class Main {
    public static void main(String[] args) {

        Student s = new Student();//Object instance of class (Student)

        s.setName("RB");

        System.out.println(s.getName());
    }
}

//Compile it using:
// javac main.java

//Run it using:
// java Main