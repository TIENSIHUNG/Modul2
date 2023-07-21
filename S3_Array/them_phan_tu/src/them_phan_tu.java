
import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon chen");
        int x = sc.nextInt();
        System.out.println("nhap index noi muon chen:");
        int y = sc.nextInt();
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
            if (i == y){
                newArr[i] = x;
                break;
            }
        }
        for (int i = y+1; i <newArr.length ; i++) {
            newArr[i] = arr[i-1];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
