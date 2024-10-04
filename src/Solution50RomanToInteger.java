public class Solution50RomanToInteger {

    public static void main(String[] args) {

        Solution50RomanToInteger solution = new Solution50RomanToInteger();
        System.out.println(solution.romanToInt("III"));
    }

    private int symbolToInt(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    public int romanToInt(String s) {
        char[] symbols = s.toCharArray();

        int number = 0;
        for (int i = 0; i < symbols.length - 1; i++) {
            int first = symbolToInt(symbols[i]);
            int second = symbolToInt(symbols[i + 1]);
            if (first >= second) {
                number += first;
            } else {
                number -= first;
            }
        }
        number += symbolToInt(symbols[symbols.length - 1]);
        return number;
    }
}
