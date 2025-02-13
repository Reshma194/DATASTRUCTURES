public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {11, 42, 83, 44, 95, 86};
        int target = 42;
        int ans=search(nums,target,1,4);
        System.out.println(ans);


    }

    static int search(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }


}
