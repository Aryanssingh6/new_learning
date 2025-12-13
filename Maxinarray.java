public class Maxinarray {
    public static void main(String[] args) {
        int[][] arr = { {8, 2, 0}, {4, 5, 6}, {7, 1, 9} };

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
                sum =  sum + arr[i][j]; 
            }
        }

        System.out.println(max);
        System.out.println(sum);
    }
}
