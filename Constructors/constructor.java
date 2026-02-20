//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class Constructor {//ClassName
    int a;

    //Constructor can be made using ClassName
    Constructor(){//(explicit non-parameter Constructor)
        a = 5;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        Constructor obj = new Constructor();//paramater passing
        System.out.println("Value of a: " +obj.a);
    }
}

//Compile it using:
// javac constructor.java

//Run it using:
// java Constructor