public class Solution26RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        new Solution26RemoveDuplicatedFromSortedArray().removeDuplicates(new int[]{1, 1, 2});
    }

    public int removeDuplicates(int[] nums) {

        //loop from left to right
        //count how many the same
        //move all the remaining forward
        int pointer = 0;
        int end = nums.length;
        while (pointer < end) {
            int compare = pointer+1;
            while (nums[pointer] == nums[compare]){
                
            }

        }
        return 1;
    }
}
