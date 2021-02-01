public class FlyweightPattern {
    private static final String colors[] = {"Red", "Yellow","Green", "Blue", "Orange" };

    private static String getRandomColor(){
        return colors [(int)(Math.random()* colors.length)]; //randomly choose a color from the colors array
    }

    public static void main(String[] args) {

        for(int i=0; i<20;i++){
            Rectangle rectangle = (Rectangle) ShapeFactory.getRectangle(getRandomColor());
            rectangle.setSize((int)(Math.random()));
            rectangle.draw();
        }
    }
}
