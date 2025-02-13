import java.util.*;
public class SearchIN2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println(maximum(arr,0));

        int target = 4;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
        static int[] search(int[][] arr,int target) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target) {
                        return new int[]{row, col};
                    }
                }
            }
            return new int[]{-1, -1};
        }
    static int maximum(int[][] arr,int max){
                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row].length; col++) {
                        if (arr[row][col] > max) {
                            max = arr[row][col];
                        }
                    }
                    }
                return max;



                }
            }