
public class MaxmimumElementInArray {
    public static void main(String[] args) {
        int[] arr = {23, 5, 11, 78, 98, 3};
        int max=arr[0];
        int ans = maximum(arr,max);
        System.out.println(ans);
    }
    static void reverse(int[] arr){
        for(int i=arr.length;i>=0;i--){
            System.out.println(arr);
        }
    }



    static int maximum(int[] arr,int max){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
//        static int maximum(int[] arr){
//            int max = arr[0];
//            for(int num:arr){
//                if(num>max){
//                    max=num;
//                }
//            }
//            return max;


    }


}
