import java.util.HashMap;
import java.util.Map;

public class Solution55JumpGame {
    public static void main(String[] args) {
        System.out.println(new Solution55JumpGame().canJump(new int[]{2, 3, 1, 1, 4}));
//        System.out.println(new Solution55JumpGame().canJump(new int[]{3, 2, 1, 0, 4}));
//        System.out.println(new Solution55JumpGame().canJump(new int[]{2, 0}));
    }

    private Map<String, Boolean> rJumpHistory = new HashMap<String, Boolean>();
    private Map<String, Boolean> lJumpHistory = new HashMap<String, Boolean>();

    private boolean jump(int[] nums, int p) {
        System.out.println(String.format("p:{%d}, step:{%d}", p, nums[p]));
        if (p == nums.length - 1) {
            return true;
        }
        if (nums[p] == 0) {
            return false;
        }
        //jump right
        for (int r = 1; r < nums[p]; r++) {
            if (p + r <= nums.length - 1) {
                String rKey = p + "-" + r;
                if (!rJumpHistory.containsKey(rKey)) {
                    System.out.println("jump right");
                    rJumpHistory.put(rKey, true);
                    if (jump(nums, p + r)) {
                        return true;
                    }
                }
            }
        }
        //jump left
        for (int l = 1; l < nums[p]; l++) {
            if (p - l >= 0) {
                String lKey = p + "-" + l;
                if (!lJumpHistory.containsKey(lKey)) {
                    System.out.println("jump left");
                    lJumpHistory.put(lKey, true);
                    if (jump(nums, p - l))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        return jump(nums, 0);
    }

}
