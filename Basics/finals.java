//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

//this final type of class cannot have sub class
final class Finals {
    
    //final keyword is used to make a constant value which can't be changed
    //final type var can't be empty
    final int a = 5;

    //method overriding is not possible
    final void greet(){
        System.out.println("Hello User!");
    }
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)

    public static void main(String args[]){

        Finals obj = new Finals();

        //final type of var or method can be accessed using object only
        obj.greet();
        System.out.println("Final value of a: "+ obj.a);
    }
}

//Compile it using:
// javac finals.java

//Run it using:
// java Finals