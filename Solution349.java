import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 创建一个存储数组
        int max = Math.max(nums1.length, nums2.length);
        int min = Math.min(nums1.length, nums2.length);
        int a[] = new int[max];
        int k = 0;
        int j = 0
        // for循环进行辨别
        if (min > 1) {
            for (int i = 0; i < min - 1; i++) {
                if (nums1[i] == nums1[i + 1])
                    continue;
                for (j = 0; i < max; j++) {
                    if (nums1[i] == nums2[j])
                        break;
                }
                if (j == nums2.length - 1) {
                    a[k] = nums1[i];
                    k++;
                }

            }
        }

        // return 
    }
}