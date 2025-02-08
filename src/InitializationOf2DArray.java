import java.util.*;
public class InitializationOf2DArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][2];
        System.out.println(arr.length);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();

            }
        }


      /*  for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println();
        }*/

        //output
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }











        /*
               int[][] arr2D={

                {1,2,3},//0th index
                {4,5},
                {6,7,8,9}
        };
 */


    }

}
