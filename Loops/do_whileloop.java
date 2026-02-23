//This is a comment
//Class name (Do_whileloop) is Capitalized form of do_whileloop.java

class Do_whileloop {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){
        
        int i = 1;   // initialization
        
        //Print numbers from 1 to 5
        do { //no condition check
            System.out.println(i);
            i++;   // increment by 1 (i= i+1)
        } while(i <= 5); //condition check begins here
    }
}

//Compile it using:
// javac do_whileloop.java
//Run it using:
// java Do_whileloop