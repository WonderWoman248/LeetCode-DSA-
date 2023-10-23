class Solution {
    public boolean isPowerOfFour(int n) {
        double x = Math.log(n)/Math.log(4);
        int y = (int)x;

        return y==x;
    }
}