import java.util.Scanner;
import java.util.Stack;

public class toBin {
    public static void main(String[] args) {
        System.out.println("nhap vao so");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Stack st = new Stack<>();
        while (a>0){
            st.push(a%2);
            a = a/2;

        }
        System.out.println(st);
        while(!(st.isEmpty())){
            System.out.println(st.pop());
        }
    }
}
