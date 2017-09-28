public class Solution {

    public static void main(String [] args){
        int [] nums = {1, 2, 4, 8, 6, 3};
        Solution a = new Solution();
        System.out.println(a.mountainSequence(nums));
    }

    /*
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = (end - start)/2 + start;

            if(nums[mid] < nums[mid+1]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        if(nums[start] > nums[end]){
            return nums[start];
        }
        else{
            return nums[end];
        }
    }
}