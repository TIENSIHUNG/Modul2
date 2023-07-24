public class max_in_arr {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3,4,5},
                {6,2,3,23,77},
                {12,54,78,22,1}
        };
        int Max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>Max){
                    Max = arr[i][j];
                }
            }

        }
        System.out.println(Max);
    }
}
