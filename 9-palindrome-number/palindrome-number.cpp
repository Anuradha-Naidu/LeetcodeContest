class Solution {
public:
    bool isPalindrome(int x) {
        
        long revNum = 0;
        int dup = x;
        
        while(x>0){
            int lastDigit = x%10;
            revNum = (revNum * 10) + lastDigit;
            x=x/10;

        }
        if(dup == revNum){
            return true;
        }
        else{
            return false;
        }

    }
};