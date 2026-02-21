//This is a comment
//----------------------------------------------------------
//class is a keyword
class Example {
    
    private int privateVar = 10;     // Only inside this class
    int defaultVar = 20;             // Same package
    protected int protectedVar = 30; // Same package and even in subclass
    public int publicVar = 40;       // Anywhere

    void display() {
        System.out.println("Inside same class:");
        System.out.println(privateVar); 
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}

//Main class is one having the main method
//Main Class name (AccessModifiers) is Capitalized form of accessModifiers
class AccessModifiers {
    public static void main(String[] args) {

        Example obj = new Example();

        // System.out.println(obj.privateVar); Not allowed (private)
        obj.display();

        System.out.println("Inside another class but in same package");
        System.out.println(obj.defaultVar);    // allowed
        System.out.println(obj.protectedVar);  // allowed
        System.out.println(obj.publicVar);     // allowed
    }
}
//Compile it using:
// javac accessModifiers.java

//Run it using:
// java AccessModifiers