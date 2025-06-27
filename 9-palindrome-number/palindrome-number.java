class Solution {
    public boolean isPalindrome(int x) {
         int original = x;
        int reverse = 0;
        if(x<0) return false;
        while (x != 0)
          {
          int m=x%10;
         reverse=(reverse*10)+m;
          x/=10; 
        }
       return reverse==original;
    }
}