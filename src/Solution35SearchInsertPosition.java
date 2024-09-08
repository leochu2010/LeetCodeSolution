public class Solution35SearchInsertPosition {

    public static void main(String[] args) {
//        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
//        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
//        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3}, 0));
//        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
//        System.out.println(new Solution35SearchInsertPosition().searchInsert(new int[]{1, 3}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int index = 0;
        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (nums[index] > target) {
                right = index - 1;
            } else {
                left = index + 1;
            }
        }
        return left;
    }
}
