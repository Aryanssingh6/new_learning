public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = { {18, 20, 30}, {49, 50, 60}, {70, 80, 90} };
        int m = arr.length;       // number of rows
        int n = arr[0].length;    // number of columns
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while(minr <= maxr && minc <= maxc){
            for(int i = minc; i <= maxc; i++){
                System.out.print(arr[minr][i] + " ");
            }
            minr++;
            for(int i = minr; i <= maxr; i++){
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            for(int i = maxc; i >= minc; i--){
                System.out.print(arr[maxr][i] + " ");
            }
            maxr--;
            for(int i = maxr; i >= minr; i--){
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
            
        }
    }
 
    
}
