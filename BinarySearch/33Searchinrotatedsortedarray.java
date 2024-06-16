class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]) return mid;
            else if(nums[start] <= nums[mid] ){
                //left is sorted
                if(target>=nums[start] && target < nums[mid]){
                    //target is present in left part
                    end = mid-1;
                }
                else {//target is in right part
                    start = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target<= nums[end]){
                    start = mid+1; //right part is sorted
                }
                else{
                    end = mid-1; //left part is sorted
                }

            }
           
        }
        return -1;
        
    }
}

//4,5,6,7,0,1,2 
//s     m      e
