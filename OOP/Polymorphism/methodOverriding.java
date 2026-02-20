//This is a comment

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
    void extra(){
        System.out.println("Extra");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Barks");
    }
}

//Class name (MethodOverriding) is Capitalized form of methodOverriding.java
class MethodOverriding {
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        Animal obj = new Dog();   // parent reference, child object
        obj.extra();              // calls extra

        Dog obj1 = new Dog();      // child reference, child object
        obj1.sound();              // calls Dog version
    }
}

//Compile it using:
// javac methodOverriding.java

//Run it using:
// java MethodOverriding