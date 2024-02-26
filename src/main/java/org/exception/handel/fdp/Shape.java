package org.exception.handel.fdp;

public abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("please draw factory Circle");
    }
}

class Rectangle  extends Shape{

    @Override
    public void draw() {
        System.out.println("please draw factory Rectangle");
    }

    public static void main(String[] args){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        circle.draw();
    }
}
