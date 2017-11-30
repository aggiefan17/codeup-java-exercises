package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("box1 perimeter is: " + box1.getPerimeter());
//        System.out.println("box1 area is: " + box1.getArea());
//
//        Square box2 = new Square(5);
//
//        System.out.println("box2 perimeter is: " + box2.getPerimeter());
//        System.out.println("box2 area is: " + box2.getArea());

        Measurable myShape = new Rectangle(5, 4);

        System.out.println("myShape perimeter is: " + myShape.getPerimeter());
        System.out.println("myShape area is: " + myShape.getArea());

        myShape = new Square(5);

        System.out.println("myShape perimeter is: " + myShape.getPerimeter());
        System.out.println("myShape area is: " + myShape.getArea());

    }
}
