//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Methods {
    
    //method or function
    void greet(){
        System.out.println("Hello User! ");
    }
    
    //method with parameters (a) and (b) of type integer
    int multiply(int a, int b){
        int product = a * b;
        System.out.println("Multiplication of " +a + " and " +b + " is: " +product);
        return 0;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //object of Methods class
        Methods obj = new Methods();

        obj.greet(); //Method calling
        obj.multiply(2,3);//Method calling with parameter passing
    }
}

//Compile it using:
// javac methods.java

//Run it using:
// java Methods