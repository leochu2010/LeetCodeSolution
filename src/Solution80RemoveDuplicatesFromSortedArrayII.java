import java.util.Arrays;

public class Solution80RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        new Solution80RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        new Solution80RemoveDuplicatesFromSortedArrayII().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
    }

    public int removeDuplicates(int[] nums) {

        int filledPos = 0;
        int filledValue = nums[0];
        int sameValueFilled = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == filledValue) {
                if (sameValueFilled < 2) {
                    sameValueFilled += 1;
                    nums[++filledPos] = nums[i];
                }
            } else if (nums[i] != filledValue) {
                sameValueFilled = 1;
                nums[++filledPos] = nums[i];
                filledValue = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(filledPos + 1);
        return filledPos + 1;
    }
}
