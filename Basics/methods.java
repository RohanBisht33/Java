//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Methods {
    
    //method/function
    void greet(){
        System.out.println("Hello User! ");
    }
    int multiply(int a, int b){
        int product = a * b;
        System.out.println("Multiplication of " +a + " and " +b + " is: " +product);
        return 0;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        Methods obj = new Methods();
        obj.greet();
        obj.multiply(2,3);
    }
}

//Compile it using:
// javac methods.java

//Run it using:
// java Methods