import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    // Hàm đệ quy tìm kiếm nhị phân
    static int binarySearch(int arr[], int value, int start, int end) {
        // Điều kiện dừng
        if (start > end) {
            return -1; // Không tìm thấy
        }
        // Tính chỉ số giữa
        int mid = (start + end) / 2;
        // So sánh giá trị cần tìm với phần tử ở giữa
        if (value == arr[mid]) {
            return mid; // Tìm thấy
        }
        else if (value < arr[mid]) {
            // Gọi lại hàm đệ quy với nửa bên trái
            return binarySearch(arr, value, start, mid - 1);
        }
        else {
            // Gọi lại hàm đệ quy với nửa bên phải
            return binarySearch(arr, value, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int b = sc.nextInt();
        int[] arr = new int[b];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu vao mang");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap so muon tim");
        int inp = sc.nextInt();
        System.out.println(binarySearch(arr,inp,0,arr.length-1));



    }

}
