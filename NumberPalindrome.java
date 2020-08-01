/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int num=x;
        int rev=0;
        while(x>0)
        {
            if(rev>214748364.7)
                return false;
            rev=rev*10;
            rev+=x%10;
            x=x/10;
        }
        if(rev==num)
            return true;
        return false;
    }
}
