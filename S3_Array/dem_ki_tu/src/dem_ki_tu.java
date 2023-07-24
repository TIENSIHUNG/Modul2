import java.util.Scanner;

public class dem_ki_tu {
    public static void main(String[] args) {
        String x = "kakakakakmaaaaaaaaaa";
        System.out.println(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ky tu muon dem");
        char y = 'a';
        System.out.println("ki tu duoc lap "+countC(x,y)+" lan");
    }
    public static int countC(String x, char y){
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y){
                count++;
            }
        }
        return count;
    }
}
