import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = new Date().getTime();
    }

    public void stop(){
       endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return endTime-startTime;
    }
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= new Random().nextInt(100000);
        }
        sort(arr);
        stopwatch.stop();

        System.out.println(Arrays.toString(arr));
        System.out.println("elapse = "+stopwatch.getElapsedTime());
    }
}
