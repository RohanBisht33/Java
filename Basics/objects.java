//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Objects {
    
    //instance variable
    int a = 5;

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    //(public) is access specifier, (static) is class-level modifier, (void) is return type, (main) is method name, (String []args) is parameter
    //------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String args[]){
        
        //object of (Objects) class with reference variable as (Objects) class type
        Objects obj = new Objects();
        //Class var = new Class();

        System.out.println("Value of a: " + obj.a); //obj.var is used to access instance variables or methods
    }
}

//Compile it using:
// javac objects.java

//Run it using:
// java Objects