/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/
class Solution {
    public int reverse(int x) {
        if (x > 2147483647 || x < -2147483648)
        {
          return 0;
        }
        int num=Math.abs(x);
        int result=0;
        while(num>0)
        {
            if(result>=214748365)
                return 0;
            result*=10;
            result+=num%10;
            num=num/10;
        }
        if(x<0)
            result*=-1;
        if (result > 2147483647 || result < -2147483648)
        {
          return 0;
        }
        return result;
    }
}
