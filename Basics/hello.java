//This is a comment
//Basic Hello World printing Java code 
//----------------------------------------------------------
//Class name (Hello) is Capitalized form of filename (hello)
//class is a keyword

class Hello{
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    //(public) is access specifier, (static) is class modifier, (void) is return type, (main) is method name, (String []args) is parameter
    //------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String args[]){
        //System.out.println() is used to show output on screen
        //-----------------------------------------------------------------------
        //(System) is a class name
        //(out) is a static variable present in System class of type PrintStream
        //(println) is a method present in PrintStream class
        //-----------------------------------------------------------------------
        System.out.println("Hello World");
    }
}

//Compile it using:
// javac (filename.java)
//----------------------
//Run it using:
// java (classname)

//For example
// javac hello.java
// java Hello