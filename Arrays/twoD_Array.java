//This is a comment
//Class name (TwoD_Array) is Capitalized form of TwoD_Array.java

class TwoD_Array {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        // Declaration + instantiating
        int[][] array = new int[2][3]; //2 Dimensional array 

        // Assigning values
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        // Printing 2D array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Compile it using:
// javac TwoD_Array.java
//Run it using:
// java TwoD_Array