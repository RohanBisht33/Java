//This is a comment
//----------------------------------------------------------
//Class name (ClassName) is Capitalized form of filename
//class is a keyword

class DataTypes {
    
    String name = "Rohan";
    int age = 20;
    float pi = 3.14f;
    char grade = 'A';
    boolean isStudying = true;

    //Compulsory (main) function/method. It is called by JVM (Java Virtual Machine)
    public static void main(String args[]){

        //object of DataTypes class
        DataTypes obj = new DataTypes();

        System.out.println("My name is: " + obj.name);
        System.out.println("My age is almost: " + obj.age + " Years");
        System.out.println("Value of pi is: " + obj.pi);
        System.out.println("My grade is: " + obj.grade);
        System.out.println("Do I study?: Obviously " + obj.isStudying);
    }
}

//Compile it using:
// javac dataTypes.java

//Run it using:
// java DataTypes