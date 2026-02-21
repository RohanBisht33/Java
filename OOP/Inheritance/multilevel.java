//This is a comment
class Animal {//Grandparent

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {//Parent

    void bark() {
        System.out.println("Barks");
    }
}

//Child class can inherit both parent and grandparent behaviou and properties
class Puppy extends Dog {//Child

    void cry() {
        System.out.println("Crying");
    }
}

//Class name (Multilevel) is Capitalized form of multilevel.java
class Multilevel {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){

        Puppy obj = new Puppy();//Child object

        obj.eat();   // Grandparent class method
        obj.bark();  // Parent class method
        obj.cry();  // Child class method
    }
}

//Compile it using:
// javac multilevel.java
//Run it using:
// java Multilevel