package ex2;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2_1 = new Point2D();
        Point2D p2_2 = new Point2D(3,4);
        System.out.println(p2_1);
        System.out.println(p2_2);
        Point3D p3_1 = new Point3D();
        Point3D p3_2 = new Point3D(4,5,6);
        System.out.println(p3_1);
        System.out.println(p3_2);
        Point2D p32_1 = new Point3D(3,4,5);
        System.out.println(p32_1);
//        Wrong decleration: sub reference cannot make obj of its super
//        Point3D p23_1 = new Point2D(1,2);
//        System.out.println(p23_1);
    }

}
