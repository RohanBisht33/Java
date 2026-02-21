//This is a comment
//----------------------------------------------------------
//Class name (Hierarchial) is Capitalized form of hierarchial.java
//class is a keyword

class Animal {//Parent

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {//Child1

    void bark() {
        System.out.println("Barks");
    }
}

class Cat extends Animal {//Child2

    void meow() {
        System.out.println("MeoW...");
    }
}

class Hierarchial {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){

        Dog dog = new Dog(); //child1
        Cat cat = new Cat(); //child2

        dog.eat();   // inherited
        dog.bark();  // Child1 method

        cat.eat();   // inherited
        cat.meow();  // Child2 method
    }
}

//Compile it using:
// javac hierarchial.java

//Run it using:
// java Hierarchial