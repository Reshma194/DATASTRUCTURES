public class MinimumNo {
    public static void main(String[] args){
        int[] arr={27,10,34,78,65,-5,90};
        System.out.println(minimum(arr));

    }

    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
return min;

    }
}
