public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int ans=search(nums,target);
        System.out.println(ans);


    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }


}




