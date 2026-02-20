//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Finals {
    
    final int a = 5;
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)

    public static void main(String args[]){

        Finals obj = new Finals();
        //final type of var can be accessed using object only
        
        System.out.println("Final value of a: "+ obj.a);
    }
}

//Compile it using:
// javac finals.java

//Run it using:
// java Finals