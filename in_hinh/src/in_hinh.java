import java.util.Scanner;

public class in_hinh {


    public static void main(String[] args) {
//            int height;
//            int width;
//            int i;
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("height = ");
//            height = sc.nextInt();
//            System.out.print("width = ");
//            width = sc.nextInt();
//            for(i = 1; i <= height; i++){
//                for(int j = 1; j <= width; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println("");
//            }
//
//            sc.close();
        int height;
        String a = "";
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        for (int i = 1; i <= height  ; ++i) {
            for (int j = 1; j <= i ; ++j) {
                a += "*";
                System.out.println(a);
            }
        }
    }

}
