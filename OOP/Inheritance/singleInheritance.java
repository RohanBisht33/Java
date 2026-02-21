//Super class
class Animal {

    String status = "Living Being";

    void eat() {
        System.out.println("Animal is eating");
    }
}

//Sub class inheriting from Animal class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

//Main class containing main method
//Class name (SingleInheritance) is Capitalized form of singleInheritance
class SingleInheritance {
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){
        
        //Object of superclass with reference variable of superclass too
        Dog obj = new Dog();

        System.out.println(obj.status);  // inherited variable
        obj.eat();                       // inherited method
        obj.bark();                      // own method
    }
}

//Compile it using:
// javac singleInheritance.java

//Run it using:
// java SingleInheritance