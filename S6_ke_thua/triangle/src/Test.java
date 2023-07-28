public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Triangle t1 = new Triangle(2,2,3);
        System.out.println(t1.isTriangle());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
        System.out.println(t1.toString());
    }
}
