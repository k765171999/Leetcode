class Solution {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0)
            sign = -1;
        x = Math.abs(x);
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        int mark = 0;
        for(int i =c.length-1;i>0;i--){
            if(c[i]=='0') mark++;
            else break;
        }
        int h = 0;
        int e = c.length-1-mark;
        while(h<e){
            char tmp = c[h];
            c[h] = c[e];
            c[e] = tmp;
            e--;
            h++;
        }
        String result = c.toString();
        int i = Integer.valueOf(result).intValue();
        i = i/Math.pow(10, mark)*sign;
        return i;
    }
}