public class Solution189 {
	public static void main(String[] args) {
		int[] nums = {-1};
		int k = 3;
		Solution189 s = new Solution189();
		s.rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			 System.out.println(nums[i]);
		}
	}
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		sort(nums, 0, nums.length-1);
		sort(nums, 0, k-1);
		sort(nums, k, nums.length-1);
	}
	public void sort(int[] nums,int start,int end){
		while(end>start){
			int tmp = nums[start];
			nums[start]=nums[end];
			nums[end]=tmp;
			end--;
			start++;
		}
	}
}	
	/*Original List                   : 1 2 3 4 5 6 7
After reversing all numbers     : 7 6 5 4 3 2 1
After reversing first k numbers : 5 6 7 4 3 2 1
After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result*/
	
	
	
	

/*	public void rotate(int[] nums, int k) {
		int[] tmp = new int[k];
		if(k>nums.length){
			k= k-nums.length;
		}
			for (int i = 0; i < k; i++) {
				tmp[i] = nums[nums.length - 1 - i];
				// System.out.println(tmp[i]);
			}
			for (int i = nums.length-1; i > k-1; i--) {
				nums[i] = nums[i-k];
//				System.out.println(nums[i]);
			}
			for (int i = 0; i < k; i++) {
				nums[k - 1 - i] = tmp[i];
				// System.out.println(nums[k-1-i]);
			}
		
	}
}*/















/*public class Solution189 {
	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		int k = 3;
		Solution189 s = new Solution189();
		s.rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			 System.out.println(nums[i]);
		}
	}

	public void rotate(int[] nums, int k) {
		int[] tmp = new int[k];
		if(k>nums.length){
			k= k-nums.length;
		}
			for (int i = 0; i < k; i++) {
				tmp[i] = nums[nums.length - 1 - i];
				// System.out.println(tmp[i]);
			}
			for (int i = nums.length-1; i > k-1; i--) {
				nums[i] = nums[i-k];
//				System.out.println(nums[i]);
			}
			for (int i = 0; i < k; i++) {
				nums[k - 1 - i] = tmp[i];
				// System.out.println(nums[k-1-i]);
			}
		
	}
}

优化方法1：

public class Solution {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}


优化方法2：
public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}*/