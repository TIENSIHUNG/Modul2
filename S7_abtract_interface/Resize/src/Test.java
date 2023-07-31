import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        Circle cir = new Circle(3);
        System.out.println(cir.getArea());
        System.out.println(cir.getPe());
        System.out.println(cir.resize(x));

        Rectangle rec = new Rectangle();
        System.out.println(rec.getArea());
        System.out.println(rec.getPe());
        System.out.println(rec.resize(x));

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPe());
        System.out.println(square.resize(x));
    }


}
