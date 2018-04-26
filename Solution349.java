import java.util.HashSet;
import java.util.Set;

/*import java.util.ArrayList;
import java.util.List;

public class Solution349 {

	
		public static void main(String[] args) {
			Solution349 s = new Solution349();
			int nums1[] = {1,2,2,1};
			int nums2[] = {1};
			s.intersection(nums1, nums2);
		}
		public int[] intersection(int[] nums1, int[] nums2) {
			int result[]=new int[Math.min(nums1.length, nums2.length)];
			int k = 0;
					if(nums1.length==0||nums2.length==0){
						return result;
					}
			for(int i = 0;i<nums1.length;i++){
				for(int j = 0;j<nums2.length;j++){
					if(nums1[i]==nums2[j]){
						if(k<Math.min(nums1.length, nums2.length)){
						result[k] = nums2[j];
						k++;
						break;
						}
					}
				}
			}
			k = 0;
			for(int i = 0;i<result.length;i++){
				if(result[i]!=0){
					k++;
				}
			}
			int x[]=new int[k];
			for(int i = 0;i<k;i++){
				x[i] = result[i];
			}
			List list = new ArrayList();
	        //遍历数组往集合里存元素
	        for(int i=0;i<x.length;i++){
	            //如果集合里面没有相同的元素才往里存
	            if(!list.contains(x[i])){
	                list.add(x[i]);
	            }
	        }
	        //toArray()方法会返回一个包含集合所有元素的Object类型数组
	        Object[] newArr = list.toArray();
	        int y[]=new int[newArr.length];
	        for(int i = 0;i<newArr.length;i++){
	        	y[i] = (int) newArr[i];
	        }
			
			
			return y;
		}

}*/
public class Solution349{
	public static void main(String[] args) {
		Solution349 s = new Solution349();
		int nums1[] = {1,2,2,1};
		int nums2[] = {1,2};
		int result[]=s.intersection(nums1, nums2);
		for(int i= 0;i<s.intersection(nums1, nums2).length;i++){
		System.out.println(result[i]);
		}
	}
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				intersect.add(nums2[i]);
			}
		}
		int result[] = new int[intersect.size()];
		int i = 0;
		for (Integer num : intersect) {
//			System.out.println(num);
			result[i] = num;
			i++;

		}
		return result;

	}
	
	

	
}