/*在这一次的题目中，用到了list.add这个和set.add的区别在于前
者可以有重复的，二后者不行，这次的码代码中最大等问题是，前后要一起移动，很关键！*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution350 {

	public static void main(String[] args) {
		Solution350 s = new Solution350();
		int nums1[] = { 1};
		int nums2[] = { 1,1};
		int result[] = s.intersect(nums1, nums2);
		for (int i = 0; i < s.intersect(nums1, nums2).length; i++) {
			System.out.println(result[i]);
		}
	}

//	public int[] intersect(int[] nums1, int[] nums2) {
//		int k = 0;
//		if (nums1.length == 0 || nums2.length == 0) {
//			return new int[0];
//		}
//		Arrays.sort(nums1);
//		Arrays.sort(nums2);
//		HashSet<Integer> set = new HashSet<>();
//		List<Integer> intersection = new ArrayList<>();
//		List<Integer> intersection2 = new ArrayList<>();
//		for (int i = 0; i < nums1.length; i++) {
//			intersection.add(nums1[i]);
//		}
//		for (int i = 0; i < nums2.length; i++) {
//			// System.out.println(nums2[0]);
//			if (intersection.contains(nums2[i])) {
//				intersection2.add(nums2[i]);
//				if(k==nums2.length-1) break;
//			}
//		}
//		int[] result = new int[intersection2.size()];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = intersection2.get(i);
//			// System.out.println(intersection2.size());
//		}
//		return result;
//	}
	public int[] intersect(int[] nums1, int[] nums2) {
		int pn1 = 0;
		int pn2 = 0;
		if (nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		HashSet<Integer> set = new HashSet<>();
		List<Integer> intersection = new ArrayList<>();
		while (pn1 < nums1.length && pn2 < nums2.length) {
			if (nums1[pn1] > nums2[pn2]) {
				pn2++;
			} else if (nums1[pn1] < nums2[pn2]) {
				pn1++;
			} else {
				intersection.add(nums1[pn1]);
				pn1++;
				pn2++;
			}
		}
		int result[] = new int[intersection.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = intersection.get(i);
		}
		return result;
	}
}
