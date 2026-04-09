class Solution {
    public int search(int[] nums, int target) {
        

        //find pivot
        int pivot = findPivot(nums);

        System.out.println(pivot);
        //check if nums[pivot] == target
        if(nums[pivot] == target){
            return pivot;
        }

        //search in first half from 0 to pivot - 1
        int firstHalf = binarySearch(0, pivot - 1, nums, target);

        if(firstHalf != -1){
            return firstHalf;
        }

        //search in second half from pivot + 1 to lenght - 1;
        int secondHalf = binarySearch(pivot + 1, nums.length - 1, nums, target);

        return secondHalf;


    }

    int binarySearch(int s, int e, int[] nums, int target){
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target > nums[m]){
                s = m + 1;
            }else if(target < nums[m]){
                e = m - 1;
            }else{
                return m;
            }
        }
        return -1;
    }

    int findPivot(int[] nums){
        int s = 0; 
        int e = nums.length - 1;

        while(s <= e){
            int m = s + (e - s) / 2;
            if(nums[s] > nums[m]){
                e = m;
            }
            else if(nums[s] < nums[m]){
                s = m;
            }else{
                return m;
            }
        }
        return -1;
    }
}
