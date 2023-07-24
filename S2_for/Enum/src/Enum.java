import java.util.Scanner;

public class Enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int N =2;
        while (count<number){
            boolean isPrime = true;
            for (int i = 2; i <=Math.sqrt(N) ; i++) {
                if (N%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(N+ " ");
                count++;
            }
            N++;
        }
    }
}
