public class Enum_100 {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            if (check(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean check(int x){
        if (x<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(x) ; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
