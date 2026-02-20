//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class ParameterConstructor {
    int a;

    //Constructor can be made using ClassName
    ParameterConstructor(int b){//(parameterized Constructor)

        //a will be assigned value of local variable (b)
        a = b;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        ParameterConstructor obj = new ParameterConstructor(4);//paramater passing
        
        System.out.println("Value of a: " +obj.a);
    }
}

//Compile it using:
// javac parameterConstructor.java

//Run it using:
// java ParameterConstructor