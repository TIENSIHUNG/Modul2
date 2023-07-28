import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setXY(12,22);
        float[] arr = {0,0};
        System.out.println(Arrays.toString(p1.getXY(arr)));


        MovablePoint mov = new MovablePoint();
        mov.setSpeed(22,32);
        System.out.println(Arrays.toString(mov.getSpeed()));
        System.out.println(mov.move());;
    }
}
