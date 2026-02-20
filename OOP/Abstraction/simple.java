//This is a comment
//It stores common behaviour of different classes
abstract class Animal {//Used to hide unnecessary information

    abstract void sound();   // abstract method (no definition)

    void sleep() {           // normal method
        System.out.println("Sleeps");
    }
}

class Dog extends Animal {

    void sound() {//Defining abstract (common) methods
        System.out.println("Barks");
    }
}

//Class name (Simple) is Capitalized form of simple.java
class Simple {
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //parent reference can access parent methods
        Animal obj = new Dog(); //Parent reference variable, child object

        obj.sound(); //parent method
        obj.sleep(); 
    }
}

//Compile it using:
// javac simple.java

//Run it using:
// java Simple