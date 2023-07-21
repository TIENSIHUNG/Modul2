import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu {
    private static int[] arr = new int[]{1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        System.out.println("Before remove:");
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so muon xoa khoi mang: ");
        int x = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        System.out.println("index remove:" + index);
        System.out.println("After remove:");
        System.out.println(Arrays.toString(removeByIndex(index)));
    }


    private static int[] removeByIndex(int index) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }
}
