import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
int count=0;
        int i = 0; // children
        int j = 0; // cookies

        while (i < g.length && j < s.length) {

            if(s[j] >= g[i]) {
                count++;
                i++;
                j++; // child satisfied
            }else{
                  j++;
            }

            // move cookie
        }

        return count;
    }
}