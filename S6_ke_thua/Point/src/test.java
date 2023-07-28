import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        float arr[] = new float[2];
        float arr2[] = new float[3];
        Point2D point1 = new Point2D();
        point1 = new Point2D(3,4);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY(arr)));

        Point3D point2 = new Point3D(5);
        point2.setXY(5,10);
        System.out.println(point2);
        System.out.println(Arrays.toString(point2.getXYZ(arr2)));



    }
}
