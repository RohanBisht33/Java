//This is a comment

//Interface declaration
interface Animal {
    void sound();   // abstract method (no body)
}

//Class implementing interface using (implements) keyword
class Dog implements Animal {

    public void sound() {
        System.out.println("Barks");
    }
}

//Class name (Interfaces) is Capitalized form of interfaces.java
class Interfaces {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){

        Dog obj = new Dog();//dog object
        obj.sound();
    }
}

//Compile it using:
// javac interfaces.java
//Run it using:
// java Interfaces