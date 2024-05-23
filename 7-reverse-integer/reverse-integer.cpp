class Solution {
public:
    int reverse(int x) {
        
        long revNum = 0; //long

        while(x){
            int lastDigit = x % 10;

            revNum = (revNum * 10) + lastDigit;
            x = x/10;
        }
        if(revNum > INT_MAX || revNum < INT_MIN) return 0;
        return int(revNum);
    }
};