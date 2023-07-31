import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3);
        resizeables[1] = new Square(3);
        resizeables[2] = new Rectangle(3,2);
        System.out.println(Arrays.toString(resizeables));
        for (int i = 0; i < resizeables.length; i++) {
            System.out.println(resizeables[i].resize(Math.random()));;
        }


//        System.out.println(resizeables[0].resize(Math.random()));
//        Circle cir = new Circle(3);
//        System.out.println(cir.getArea());
//        System.out.println(cir.getPe());
//        System.out.println(cir.resize(x));
//
//        Rectangle rec = new Rectangle();
//        System.out.println(rec.getArea());
//        System.out.println(rec.getPe());
//        System.out.println(rec.resize(x));
//
//        Square square = new Square(5);
//        System.out.println(square.getArea());
//        System.out.println(square.getPe());
//        System.out.println(square.resize(x));
//    }


}}
