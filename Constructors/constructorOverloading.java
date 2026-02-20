//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class ConstructorOverloading {//Constructor 1,2 or 3 will be called according to the parameters passed!!
    
    int num;
    String name;

    //Constructor1
    ConstructorOverloading(){
        num = 10;
        name = "First";
    }

    //Constructor2
    ConstructorOverloading(int a){
        num = a;
        name = "Second";
    }

    //Constructor3
    ConstructorOverloading(int a, String b){
        num = a;
        name = b;
    }

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        ConstructorOverloading obj1 = new ConstructorOverloading();//Explicit Default num and name is initialized
        ConstructorOverloading obj2 = new ConstructorOverloading(5);//Explicit Default name is initialized
        ConstructorOverloading obj3 = new ConstructorOverloading(20, "Third");//Explicit parameters are initialized

        System.out.println("Constructor1: " +obj1.num + " and " +obj1.name);
        System.out.println("Constructor2: " +obj2.num + " and " +obj2.name);
        System.out.println("Constructor3: " +obj3.num + " and " +obj3.name);
    }
}

//Compile it using:
// javac constructorOverloading.java

//Run it using:
// java ConstructorOverloading