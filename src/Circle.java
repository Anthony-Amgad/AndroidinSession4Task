public class Circle extends Shape implements Callout{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "Black";
    }

    public Circle(double radius, boolean filled, String color) {
        this.radius = radius;
        this.filled = filled;
        this.color = color;
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public void callOut(){
        System.out.println("I am a Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
