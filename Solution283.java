
class Solution283 {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length-2; i >=0; i--) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
    }
}
/* Better Solution2833


class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
		int p = 0 ;//作为全局指针
		int q = 0 ;//指向0
		
		while(p < n) {
			if(nums[p] != 0) {
				nums[q] = nums[p] ;
				q++;
			}
			p++ ;
		}
		for(int i = q ; i < n ; i++) {
			nums[i] = 0 ;
		}
    }

}*









public  void moveZeroes(int[] nums) {
    int k = 0; //nums[0,k)范围内元素都不等于0
    for (int i = 0; i < nums.length; i++) 
        if (nums[i] != 0 && k++ != i) {//如果k和i相等,那么就不必进行无意义的赋值
            nums[k - 1] = nums[i];
            nums[i] = 0;
        }
}
    }*/