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
        MovablePoint m1 = new MovablePoint(1,2,3,4);
        System.out.println(m1);
        System.out.println(m1.move());
        Point2D m2 = new MovablePoint(1,2,3,4);
//        Wrong call method: the provoke is base on the type of variable m2,
//        m2 type is Point2D, while its obj type that it refrence to is MovablePoint => m2.MovablePointmethod is invalid;
//        System.out.println(m2);
//        System.out.println(m2.move);
        System.out.println(m2.testMethod());
//        However, if the method that provoked is an override method from parent class, its can still be provoked
//        Its actually provoke the method from children,
//        (method can only be provoked based from father but the really work inside is the child class)
//        Conclude: cannot provoke overridden parent method directly by super from outside child class
//        System.out.println(MovablePoint.testMethod());
//        System.out.println(Object.super.toString());
    }
}
