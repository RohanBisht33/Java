//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Statics {
    
    static int a = 5;
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //Static variable can be accessed using dot operator on Class name
        System.out.println("Static value of a: " + Statics.a);
    }
}

//Compile it using:
// javac statics.java

//Run it using:
// java Statics