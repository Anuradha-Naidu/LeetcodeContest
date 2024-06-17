class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+ (right-left)/2;
            if(nums[mid]>=nums[right]){
                left=mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];

    }
};

//nums = [4,5,6,7,0,1,2]:

/*Initial state:

left = 0, right = 6.
mid = 3, nums[mid] = 7, nums[right] = 2.
Since nums[mid] >= nums[right], we update left = mid + 1 = 4.

After the first iteration:

left = 4, right = 6.
mid = 5, nums[mid] = 1, nums[right] = 2.
Since nums[mid] < nums[right], we update right = mid = 5.

After the second iteration:

left = 4, right = 5.
mid = 4, nums[mid] = 0, nums[right] = 1.
Since nums[mid] < nums[right], we update right = mid = 4.

After the third iteration:

left = 4, right = 4.
The loop stops as left is no longer less than right, and the algorithm returns nums[left], which is 0.

So, for the input nums = [4,5,6,7,0,1,2], the output of the algorithm is 0, which is correct.

Complexity
Time complexity: O(logn)

Space complexity: O(1)
  */
