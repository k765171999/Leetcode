class Solution387 {
    public int firstUniqChar(String s) {
        int[] a = new in[26];
        for(int i = 0;i<s.length;i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(a[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
/*class Solution {
    public int firstUniqChar(String s) {
        int start;
        int end;
        int result = s.length();
        for(char ch='a';ch<='z';ch++) {
            start = s.indexOf(ch);
            end = s.lastIndexOf(ch);
            if(start == end && start != -1) {
                result = Math.min(result,start);
            }
        }
        if(result == s.length()) {
            return -1;
        }
        return result;
    }
}*/