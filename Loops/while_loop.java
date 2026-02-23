//This is a comment

//Class name (While_loop) is Capitalized form of while_loop.java
class While_loop {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        int i = 1;   // initialization
        
        //Print numbers from 1 to 5
        while(i <= 5){ //while(condition)
            System.out.println(i);
            i++;   // increment by 1 (i = i+1)
        }
    }
}

//Compile it using:
// javac while_loop.java
//Run it using:
// java While_loop