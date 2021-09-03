public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Square square = new Square(2,5);

        System.out.println(circle.getArea() + " : " + circle.getPerimeter());
        System.out.println(square.getArea() + " : " + square.getPerimeter());

        type(circle);
        type(square);
    }

    public static void type(Callout shape){
        shape.callOut();
    }
}
