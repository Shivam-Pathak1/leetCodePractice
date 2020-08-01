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
