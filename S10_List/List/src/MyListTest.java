import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {

        myList<Integer> listInteger = new myList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println(""+listInteger.get(0));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 3: "+listInteger.get(3));


        System.out.println("element 4: "+listInteger.get(4));

    }
}
