import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class insertion {
//    public static void buble(int[] arr){
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = arr.length -1; j > i ; j--) {
//                if (arr[j]<arr[j-1]){
//                    int temp = arr[j];
//                    arr[j]= arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//    }
//
//    public static void selection(int[] arr){
//        int min ;
//        for (int i = 0; i < arr.length - 1; i++) {
//            min = i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[j]<arr[min]){
//                    min = j;
//                }
//            }
//            if (min!=i){
//                int temp = arr[i];
//                arr[i]=arr[min];
//                arr[min]=temp;
//            }
//        }
//    }

    public static void insert(int[] arr){
        int pos,x;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            x= arr[i];
            while (pos>0 && x<arr[pos-1]){
                arr[pos-1] = arr[pos];
                pos--;
            }
            arr[pos] = x;
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,6,7,3,5,6,7,9,15};
        System.out.println(Arrays.toString(arr));
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
