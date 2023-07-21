import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int count = 1;
        System.out.println("nhap vao x so nguyen to dau tien nho hon 1000");
        int x = sc.nextInt();
        if (x>1000){
            System.out.println("ko hop le");
        }else {
            System.out.println(2);
            for (int i = 2; i <= 1000; i++) {
                for (int j = 1; j <=Math.sqrt(i) ; j++) {
                    if (i%j==0){
                        continue;
                    }else{
                        System.out.println(i);
                        count++;
                    }
                }if (count == x){
                    break;
                }
            }
        }

    }
}
