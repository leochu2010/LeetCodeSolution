import java.util.Arrays;

public class Solution26RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        new Solution26RemoveDuplicatedFromSortedArray().removeDuplicates(new int[]{1, 1, 2});
        new Solution26RemoveDuplicatedFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public int removeDuplicates(int[] nums) {
        //0,0,1,1,1,2,2,3,3,4
        //0,1,1,1,1,2,2,3,3,4
        //0,1,2,2,2,2,2,3,3,4
        //0,1,2,3,3,3,3,3,3,4
        //0,1,2,3,4,4,4,4,4,4


        int[] uniqueNums = new int[nums.length];
        int lastValue = nums[0];
        int uniqueCount = 1;
        uniqueNums[0] = lastValue;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > lastValue) {
                lastValue = nums[i];
                uniqueNums[uniqueCount] = lastValue;
                uniqueCount += 1;
            }
        }
        for (int i = 1; i < uniqueCount; i++) {
            nums[i] = uniqueNums[i];
        }

        System.out.println(uniqueCount);
        System.out.println(Arrays.toString(nums));
        return uniqueCount;
    }
}
