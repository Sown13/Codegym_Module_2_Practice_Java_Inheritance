package p1;


public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Blue",true);
        System.out.println(shape1);
        Circle c1 = new Circle(10,"green",false);
        System.out.println(c1);
        Rectangle r1 = new Rectangle(20,1);
        System.out.println(r1);
        Square s1 = new Square();
        System.out.println(s1);
    }
}
