class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;

        

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid + 1; //discard left part of array
            }
            else{
                end= mid -1; //discard right part of array
            }
        }
        return -1;
    }
}

//standard binary search :  Time = O(logn)
