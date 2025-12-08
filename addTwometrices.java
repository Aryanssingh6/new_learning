public class addTwometrices {
    public static void main(String[] args) {
        int[] [] a = { {1, 3, 3}, {4, 5, 6}, {7, 8, 9} };
        int[] [] b = { {9, 5, 68}, {6, 5, 43}, {3, 2, 56} };
        int m = a.length;
        int n = a[0].length;
        int res[] [] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
