//This is a comment
//Class name (SimpleArray) is Capitalized form of simpleArray.java

class SimpleArray {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        // Default value initialization
        int[] numbers = {1, 2, 3, 4, 5}; //array initialization of type int

        // Print elements
        for(int i = 0; i < numbers.length; i++){ //array.length is inbuilt function
            System.out.println(numbers[i]);
        }
    }
}

//Compile it using:
// javac simpleArray.java
//Run it using:
// java SimpleArray