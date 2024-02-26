package org.exception.handel.fdp;

public class FactoryDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        // Get an object of Rectangle and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}

// When there is a supper class and multiple subclass, and we want to get object of a subclass based on input and requirements
// Then we create factry class which takes the responsibility of creating object of class based on input.

// Advantage - focus on creating object of interface rather then implementation
// Lose coupling
