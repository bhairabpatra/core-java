package org.exception.handel.fdp;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.trim().equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.trim().equalsIgnoreCase("Rectangle")){
            return  new Rectangle();
        }
        return null;
    }

}