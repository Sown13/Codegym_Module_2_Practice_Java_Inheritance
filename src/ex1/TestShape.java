package ex1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "Yellow");
        System.out.println(circle1);
        System.out.println("Co dien tich la " + circle1.getArea());
        Cylinder cy1 = new Cylinder(5, "Green", 10);
        cy1.setRadius(3);
        System.out.println(cy1);
        System.out.println(cy1.getPerimeter());
        System.out.println(cy1.getVolume());
    }
}
