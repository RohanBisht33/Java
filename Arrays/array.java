//This is a comment
//Class name (Array) is Capitalized form of array.java

class Array {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        // Declaration + instantiation (no value assigned)
        int[] array = new int[5];

        // Assigned values manually
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        // Print elements
        for(int i = 0; i < array.length; i++){// array.length is inbuilt
            System.out.println(array[i]);
        }
    }
}

//Compile it using:
// javac array.java
//Run it using:
// java Array