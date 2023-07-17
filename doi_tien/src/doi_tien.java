import java.util.Scanner;

public class doi_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        System.out.print("Nhập số tiền USD muốn đổi thành VNĐ: ");
        double usd = Double.parseDouble(sc.nextLine());
        double change = usd * vnd;
        System.out.print("Giá trị VNĐ: " + change);
    }
}