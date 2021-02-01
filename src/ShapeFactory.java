import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap rectangleMap = new HashMap(); //key = color & value = rectangle instance



    //get the rectangle with the provided color.
    // if it doesnt exist, create and put the instance in the map and then return.
    public static Shape getRectangle(String color){
        Rectangle rectangle = (Rectangle) rectangleMap.get(color);

        if(rectangle == null){
            rectangle = new Rectangle(color);
            rectangleMap.put(color, rectangle);
            System.out.println("creating rectangle of color: "+ color);
        }
        return rectangle;
    }
}
