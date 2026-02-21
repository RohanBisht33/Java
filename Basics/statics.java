//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Statics {
    
    //static keyword is used to make a class level variable/method
    //static variable/methods are loaded during class loading
    static int a = 5;

    static void greet(){
        System.out.println("Hello User!");
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //Static methods can be accessed using dot operator on Class name or (normally within same class)
        Statics.greet();
        greet();

        //Static variable can be accessed using dot operator on Class name or normally
        System.out.println("Static value of a with dot operator: " + Statics.a);
        System.out.println("Static value of a: " + a);
    }
}

//Compile it using:
// javac statics.java

//Run it using:
// java Statics