//This is a comment
//Class name (JaggedArray) is Capitalized form of jaggedArray.java

class JaggedArray {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        // Declare jagged array (3 rows and unknown columns)
        int[][] array = new int[3][];

        // Assign different columns for different rows
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        // Assign values
        array[0][0] = 10;
        array[0][1] = 20;

        array[1][0] = 30;
        array[1][1] = 40;
        array[1][2] = 50;
        array[1][3] = 60;

        array[2][0] = 70;

        // Printing jagged array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Compile it using:
// javac jaggedArray.java
//Run it using:
// java JaggedArray