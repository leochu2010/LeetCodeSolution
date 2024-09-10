import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution179LargestNumber {

    public static void main(String[] args) {
        System.out.println(
                new Solution179LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9})
        );
    }

    public String largestNumber(int[] nums) {
        String num = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining(""));

        if (num.charAt(0) == '0')
            return "0";
        else
            return num;
    }

}
