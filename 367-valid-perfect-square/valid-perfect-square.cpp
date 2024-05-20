#define li long int
class Solution {
public:
    bool isPerfectSquare(int num) {
        
        //li = long int
        //binary search method 

        li high = 100000;
        li low = 0;
        li mid;
        li square;

        while(low <= high){

            mid = low + (high-low)/2;
            square = mid*mid;
            if(square == num)
                return true;
            
            else if(square < num)
                low = mid+1;
            
            else 
                high = mid - 1;
            
        }
        return false;
    }
};