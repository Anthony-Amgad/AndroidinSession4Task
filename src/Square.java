public class Square extends Shape implements Callout{
    private double length, width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
        this.filled = false;
        this.color = "Black";
    }

    public Square(double length, double width, boolean filled, String color) {
        this.length = length;
        this.width = width;
        this.filled = filled;
        this.color = color;
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    @Override
    public void callOut(){
        System.out.println("I am a Square");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
