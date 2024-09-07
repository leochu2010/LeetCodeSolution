import java.util.Arrays;

public class Solution27RemoveElement {
    public static void main(String[] args){
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int valCount = 0;
        int numLength = nums.length;
        for (int i = 0; i< numLength; i++){
            while (nums[i] == val && valCount + i < numLength){
                valCount += 1;
                nums[i] = nums[numLength - valCount];
            }
        }
        System.out.println(Arrays.toString(nums));
        return valCount;
    }
}
