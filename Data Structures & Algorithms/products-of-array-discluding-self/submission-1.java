class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length]; //O(n)
        int[] left = new int[nums.length];//(n)
        int[] right = new int[nums.length];// (n) == n

        left[0] = 1;

        for(int i = 1; i < nums.length; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >= 0; i--){
            right[i] = nums[i + 1] * right[i + 1];
        }


        for(int i = 0; i < nums.length; i++){ 
           ans[i] = left[i] * right[i];
        }
        return ans;
    }

//left = [1, 1, 2, 8]
//right= [48, 24,6, 1]
// ans = [48, 24, 12, 8]
}  
