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
/*
1.进行异或计算前会把数值都转换为二进制：
5和3转为二进制分别为：0101 、0011
0101
xor
0011
--------
　结果	
0110
2.再把结果 0110 转换为十进制的：6
3.所以 5 ⊕ 3 = 6


两个完全一样的数进行异或，结果为零

任何数与0进行异或结果不变！
*/
