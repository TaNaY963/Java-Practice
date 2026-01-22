import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
           }
        }
        return k;
    }
}
public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int k = obj.removeDuplicates(arr);

        int[] uniqueArray = Arrays.copyOf(arr, k);
        System.out.println("New Array: " + Arrays.toString(uniqueArray));
        System.out.println("Count: " + k);
    }
}