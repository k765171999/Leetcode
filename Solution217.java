import java.util.Arrays;

public class Solution217 {
    public static void main(String[] args) {
        int nums[] = {2,2,3,4,6,4,6};
        Solution217 s = new Solution217();
       System.out.println( s.containsDuplicate(nums));
//        System.out.println(nums[5]);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}