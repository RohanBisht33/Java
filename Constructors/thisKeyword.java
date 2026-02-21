//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class ThisKeyword {
    int a;

    //Constructor can be made using ClassName
    ThisKeyword(int a){//a is local variable

        //this keyword is used to refer to instance variable of class i.e., (a)
        this.a = a;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //object of ThisKeyword class
        ThisKeyword obj = new ThisKeyword(4);//paramater passing
        System.out.println("Value of a: " +obj.a);
    }
}

//Compile it using:
// javac thisKeyword.java

//Run it using:
// java ThisKeyword