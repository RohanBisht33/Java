//This is a comment

//Class name (For_loop) is Capitalized form of for_loop.java
class For_loop {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        //Print numbers from 1 to 5
        for(int i = 1; i <= 5; i++){ // for(initialization; condition; increment)
            System.out.println(i); //println for new line after output
        }
    }
}

//Compile it using:
// javac for_loop.java
//Run it using:
// java For_loop