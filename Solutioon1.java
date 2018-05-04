import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s=new Solution1();
		int[] nums = {3,2,4};
		int target = 6;
		int a[] = s.twoSum(nums, target);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}
    public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
        int result[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > target)
                break;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > target)
                    break;
                System.out.println(nums[i]+""+nums[j]);
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
//                    System.out.println(i);
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;

    }
}