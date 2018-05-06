class Solution {
    public String reverseString(String s) {
        char[] c =s.toCharArray();
        int h = 0;
        int e = c.length-1;
        while(e>h){
            char tmp = c[h];
            c[h] = c[e];
            c[e] = tmp;
            e--;
            h++;
        }
        s = s.valueOf(c);
        return s;
    }
}