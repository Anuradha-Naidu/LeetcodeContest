class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s= new String[n];
        for(int i=0;i<n;i++)
            s[i] = String.valueOf(nums[i]);

            Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));

            StringBuilder sb = new StringBuilder();
            for(String str : s)
                sb.append(str);
            
            String result = sb.toString();
            return result.startsWith("0") ? "0": result;


        
        
    }
}
//input : nums=[10,2]
//output: "210"

//3,30,34,5,9
//if we sort : 9534330 or 9534303