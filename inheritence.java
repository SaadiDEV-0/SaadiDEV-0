package com.mycompany.inheritance;

import com.mycompany.inheritance.Animal.Dog;

class Animal{

    void eat(){
       System.out.println("This animal eats food");

    }
    
class Dog extends Animal{
    void bark(){
    System.out.println("The Dog barks");
    }
}    
}

public class INHERITANCE {

    public static void main(String[] args) {
        Dog myDog = newDog();
        myDog.eat();
        myDog.bark();
        
        
    }

    private static Dog newDog() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
