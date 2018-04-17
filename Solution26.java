
public class Solution26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4 };
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				continue;
			}else{
				count++;
				nums[count]=nums[i+1];
			}
		}
		for(int i=0;i<count+1;i++){
			System.out.print(nums[i]);
		}
	}

}
