class Solution {
    public int singleNumber(int[] nums) {
        // 进行异或运算
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            a^=nums[i];
        }
        return a;
        // return 只出现一次的值
    }
}
