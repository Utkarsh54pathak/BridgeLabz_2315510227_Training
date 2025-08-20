import java.util.*;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("rows");
        int rows = input.nextInt();
        System.out.println("columns");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int[] arr = new int[rows*cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i*cols+j] = array[i][j];
            }
        }
       for(int i : arr){
           System.out.print(i+" ");
       }
    }
}
