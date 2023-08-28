import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của hình tam giác:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Đây là một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
