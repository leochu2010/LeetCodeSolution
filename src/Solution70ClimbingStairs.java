public class Solution70ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new Solution70ClimbingStairs().climbStairs(3));
        System.out.println(new Solution70ClimbingStairs().climbStairs(4));
    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int step = climbStairs(n - 1);
        if (n % 2 == 1) {
            step = 1 + (step - 1) * 2;
        } else {
            step = 2 + (step - 1) * 2;
        }
//        System.out.println(String.format("n:%d, step:%d", n, step));
        return step;
    }
}
