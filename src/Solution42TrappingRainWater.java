import java.util.Arrays;

public class Solution42TrappingRainWater {
    public static void main(String[] args) {
        new Solution42TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        new Solution42TrappingRainWater().trap(new int[]{4, 2, 0, 3, 2, 5});
        new Solution42TrappingRainWater().trap(new int[]{0});
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;

        // two pointers not collide
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        System.out.println(water);
        return water;
    }

//    private int countWater(int[] height, int height1, int height2) {
//        int level = Math.min(height[height1], height[height2]);
//        int water = 0;
//        for (int i = height1 + 1; i < height2; i++) {
//            water += level - height[i];
//        }
//        System.out.printf("level:{%d}, height 1:{%d}, height 2:{%d}, trap:{%s}%n", level, height1, height2, Arrays.toString(Arrays.copyOfRange(height, height1, height2 + 1)));
//        return water;
//    }
//
//    private int getHighestLeft(int[] height) {
//        // find the highest on the left
//        int highestLeft = -1;
//        for (int i = 0; i < height.length; i++) {
//            if (height[i] > 0) {
//                highestLeft = i;
//                break;
//            }
//        }
//        if (highestLeft == -1) {
//            return -1;
//        }
//        System.out.println(String.format("Highest Left:{%d}, height:{%d}", highestLeft, height[highestLeft]));
//        return highestLeft;
//    }
//
//    private int getTrapRight(int[] height, int highestLeft, int trapRight) {
//        // find higher than highestleft
//        for (int i = highestLeft + 1; i < height.length; i++) {
//            if (height[i] > height[highestLeft]) {
//                trapRight = i;
//                System.out.println(String.format("Trap Right:{%d}, height:{%d}", trapRight, height[trapRight]));
//                return trapRight;
//            }
//        }
//        // if left already the highest, find the highest in the right
//        if (highestLeft < height.length - 1) {
//            int highestRight = highestLeft + 1;
//            for (int i = highestLeft + 1; i < height.length; i++) {
//                if (height[i] > height[highestRight]) {
//                    highestRight = i;
//                }
//            }
//            trapRight = highestRight;
//            System.out.println(String.format("Trap Right:{%d}, height:{%d}", trapRight, height[trapRight]));
//            return trapRight;
//        }
//        return -1;
//    }
//
//    public int trap(int[] height) {
//        int water = 0;
//        int highestLeft = getHighestLeft(height);
//        if (highestLeft == -1) {
//            return 0;
//        }
//        // find the first higher then me or the next highest
//        int trapRight = getTrapRight(height, highestLeft, -1);
//        if (trapRight == -1) {
//            return water;
//        }
//        int trapWater = countWater(height, highestLeft, trapRight);
//        water += trapWater;
//        System.out.println(String.format("Water:{%d}, Total:{%d}", trapWater, water));
//        while (trapRight + 1 < height.length) {
//            highestLeft = trapRight;
//            trapRight = getTrapRight(height, highestLeft, highestLeft);
//            if (trapRight == -1) {
//                return water;
//            }
//            trapWater = countWater(height, highestLeft, trapRight);
//            water += trapWater;
//            System.out.println(String.format("Water:{%d}, Total:{%d}", trapWater, water));
//        }
//        return water;
//    }
}
