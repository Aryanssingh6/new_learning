import java.util.Scanner;

public class Marksandroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][2];

        // Input (5 rows, 2 columns)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output as matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");  // don't use println here
            }
            System.out.println(); // move to next line after each row
        }

        sc.close();
    }
}
   
