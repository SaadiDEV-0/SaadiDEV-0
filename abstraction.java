package com.mycompany.abstraction;

abstract class Shape {
    
    abstract void draw();
    
    void display() {
        System.out.println("Displaying the shape.");
    }
}

class Circle extends Shape {
    
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }
}





public class ABSTRACTION {

    public static void main(String[] args) {
        
        
        Circle circle = new Circle();
        Square square = new Square();
        
        
        circle.draw();
        circle.display();
        
        square.draw();
        square.display();
        
        
    }
}
