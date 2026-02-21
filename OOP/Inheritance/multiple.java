//This is a comment

interface Father {//Parent1
    void showFather();
}

interface Mother {//Parent2
    void showMother();
}

//implements keyword is used to inherit from interfaces
class Child implements Father, Mother {//inheriting from 2 parents

    public void showFather() {//Defining father method
        System.out.println("Your father");
    }

    public void showMother() {//Defining mother method
        System.out.println("Your mother");
    }
}


//Class name (Multiple) is Capitalized form of multiple.java
class Multiple {
    
    //Compulsory main method. Called by JVM
    public static void main(String args[]){

        Child obj = new Child();//child object

        obj.showFather();//Father interface method
        obj.showMother();//Mother interface method
    }
}

//Compile it using:
// javac multiple.java
//Run it using:
// java Multiple