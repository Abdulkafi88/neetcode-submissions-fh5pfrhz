class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){ 
            int multiple = 1;
            for(int j = 0; j < nums.length; j++){
                if(!(i == j)){
                    multiple *= nums[j]; 
                }
            }
            res[i] = multiple;
        }
        return res;
    }
}  
