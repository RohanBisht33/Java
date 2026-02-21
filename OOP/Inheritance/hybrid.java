//    GrandParent
//         |
//   ---------------
//   |             |
// Father         Aunt
//   |
//  Son

class GrandParent {//GrandParent
    void eat() {
        System.out.println("Grandparents eat");
    }
}

//Hierarchial inheritance
class Father extends GrandParent {//Father can inherit from GrandParent
    void work() {
        System.out.println("Father goes to work");
    }
}

//Hierarchial inheritance
class Aunt extends GrandParent {//Aunt can inherit from GrandParent
    void sleep() {
        System.out.println("Aunt sleep at night");
    }
}

//Multilevel inheritance
class Son extends Father {// Son can only inherit from GrandParent and Father class
    void cry() {
        System.out.println("Grandson cries");
    }
}

//Class name (Hybrid) is Capitalized form of hybrid.java
class Hybrid {

    //Compulsory main method. Called by JVM
    public static void main(String args[]){

        //Father and Aunt are children of GrandParent
        Son grandson = new Son();//Son is direct child of Father
        Aunt relative = new Aunt();//Aunt is sister of Father

        grandson.eat();  // from GrandParent
        grandson.work();  // from Father
        grandson.cry();  // from Son himself
        
        relative.eat();  // from GrandParent
        relative.sleep();  // from aunt herself
    }
}

//Compile it using:
// javac hybrid.java

//Run it using:
// java Hybrid