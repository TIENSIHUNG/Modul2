import java.util.Arrays;
import java.util.Stack;

public class reverseStack {
//    public static void main(String[] args) {
//        Stack st = new Stack<>();
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            st.push(arr[i]);
//        }
//        System.out.println(st);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) st.pop();
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }


    public static void main(String[] args) {
        Stack st = new Stack<String>();
        String stTest = "ayyyooooooo wattttttsupppp";
        String[] a = stTest.split("");

        for (int i = 0; i < a.length; i++) {
            st.push(a[i]);
        }



        for (int i = 0; i < a.length; i++) {
            a[i] = st.pop().toString();
        }

        System.out.println(Arrays.toString(a));
    }
}
