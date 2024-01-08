package com.mycompany.polymorphism;

class Shape{
    void draw(){
    System.out.println("Drawing a shape");
    }

}

class Circle extends Shape{
@Override
  void draw(){
    System.out.println("Drawing a circle");
  }

}


class Square extends Shape{
@Override
  void draw(){
    System.out. println("Drawing a square");
  }
}

public class POLYMORPHISM {

    public static void main(String[] args) {
        Shape myShape;
        
        myShape = newCircle();
        myShape.draw();
        
        myShape=newSquare();
        myShape.draw();
    }
    
    
    
    private static Shape newCircle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static Shape newSquare() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}