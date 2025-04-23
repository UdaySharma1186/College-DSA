package OOPS;

// 4 pillars of OOPS
// Inheritance (Code reusability)
// Polymorphism (Code reusability)
// Encapsulation (Data Hiding)
// Abstraction (Data Hiding)


// Abstraction --> Data Hinding

// Abstraction can be achieved using two things
// 1. using abstract class (abstraction achieved 0 to 100 %)
// why
// because in abstract classes we can have both abstract methods and also non abstract methods

//abstract class Animal {
//    // abstract method (no body)
//    abstract void makeSound();
//
//    // concrete method ie non abstract method
//    void sleep(){
//        System.out.println("Sleeping !!!");
//    }
//}
//
//class Dog extends Animal {
//    // must implement the abstract method
//    void makeSound(){
//        System.out.println("Bark");
//    }
//
//    // override the concrete method
//    @Override
//    void sleep(){
//        System.out.println("Bow bow sleep");
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Animal myDog = new Dog();
//        myDog.makeSound();
//        myDog.sleep();
//    }
//}

// 2. using interface (abstraction achieved 100 %)

interface Animal {
    // all the methods in interfaces are abstract by default (untill java 8)
    void sound();


    // since java 8, we have concrete default methods too
    default void sleep(){
        System.out.println("Sleeping....");
    }
}

class Dog implements Animal {
    // must implement the abstract method
    public void sound(){
        System.out.println("Bark");
    }

    // optionally overriding the abstract method
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping....");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}