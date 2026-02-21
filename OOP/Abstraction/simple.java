//This is a comment
//It stores common behaviour of different
abstract class Animal {//Used to hide unnecessary information

    void sound() {
        System.out.println("Makes sound");
    }
}

class Dog extends Animal {

    void bite() {          
        System.out.println("bitten");
    }
}

//Class name (Simple) is Capitalized form of simple.java
class Simple {
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        Dog obj = new Dog(); //child reference variable, child object

        obj.sound(); //parent method 
        obj.bite(); //child method
    }
}

//Compile it using:
// javac simple.java

//Run it using:
// java Simple