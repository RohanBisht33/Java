//This is a comment
//Class name (For_eachloop) is Capitalized form of for_eachloop.java

class For_eachloop {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        int[] numbers = {10, 20, 30, 40, 50};//array

        //For-each loop to print array elements
        for(int num : numbers){ // for(datatype var: sequence)
            System.out.println(num);
        }
    }
}

//Compile it using:
// javac for_eachloop.java
//Run it using:
// java For_eachloop