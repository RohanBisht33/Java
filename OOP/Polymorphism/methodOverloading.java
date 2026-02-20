//This is a comment
//Additional class used for adding
class Add {

    int add(int a, int b) {//method1
        return a + b;
    }

    int add(int a, int b, int c) {//method2
        return a + b + c;
    }
}

//Main class
//Class name (MethodOverloading) is Capitalized form of methodOverloading.java
class MethodOverloading {
    
    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        Add obj = new Add();//object creation

        System.out.println(obj.add(5, 10));//method1
        System.out.println(obj.add(5, 10, 15));//method2
    }
}

//Compile it using:
// javac methodOverloading.java

//Run it using:
// java MethodOverloading