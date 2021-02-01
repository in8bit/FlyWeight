public class Rectangle implements Shape{
    private String color;
    private int size;

    public Rectangle(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn with the size : "+ size + " and color: "+ color);
    }
}
