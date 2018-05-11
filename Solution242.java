class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int mark = 0;
        int mark1 = 0;
        int tmp[] = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            if((c1[i]^c2[i])!=0){
               tmp[i] = (c1[i]^c2[i]);
               mark = i;
            }  
        }
        if(tmp[0]==tmp[1]){
            return true;
        }

        return false;
        // for(int i = 0;i<mark;i++){
        //     if(tmp[i]==)
        // }
    }
}
/**   public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
}
}
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) {
            return false;
        }
    }
    return true;
} */