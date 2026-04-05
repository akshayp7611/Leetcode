class Solution {
    public boolean judgeCircle(String moves) {
        int hori= 0;
        int ver=0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                ver++;
            } else if (moves.charAt(i) == 'L') {
                hori++;
            } else if (moves.charAt(i) == 'D') {
               ver--;
            } else {
               hori--;
            }
        }
       return hori==0 && ver==0;
    }
}