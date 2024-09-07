import java.util.Arrays;

public class Solution169MajorityElement {
    public static void main(String[] args) {
        new Solution169MajorityElement().majorityElement(new int[]{3, 2, 3});
        new Solution169MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length / 2]);
        return nums[nums.length / 2];
    }
}
