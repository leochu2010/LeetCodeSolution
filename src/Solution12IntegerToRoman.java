public class Solution12IntegerToRoman {

    public static void main(String[] args) {
        Solution12IntegerToRoman solution = new Solution12IntegerToRoman();
        System.out.println(solution.intToRoman(3749));
    }

    public String intToRoman(int num) {
        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder roman = new StringBuilder();
        while (num > 0) {
            if (num >= integers[i]) {
                roman.append(romans[i]);
                num -= integers[i];
            } else {
                i += 1;
            }
            System.out.println(roman);
        }
        return roman.toString();
    }
}
