import java.util.Arrays;

public class ReverseArratByCopy {
    public static void main(String[] args){
        int[] arr={7,3,2,9,34};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-i-1];

        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

    }


}
