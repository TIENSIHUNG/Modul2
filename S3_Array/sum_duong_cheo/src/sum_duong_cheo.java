import java.util.Scanner;

public class sum_duong_cheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mang mxn");
        System.out.println("nhap m");
        int m = sc.nextInt();
        System.out.println("nhap n ");
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap vao phan tu"+i+""+j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
