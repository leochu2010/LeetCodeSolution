public class Solution74SearchA2DMatrix {
    public static void main(String[] args) {
//        System.out.println(new Solution74SearchA2DMatrix().searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
//        System.out.println(new Solution74SearchA2DMatrix().searchMatrix(new int[][]{{1}}, 2));
        System.out.println(new Solution74SearchA2DMatrix().searchMatrix(new int[][]{{1, 1}}, 2));
//        System.out.println(new Solution74SearchA2DMatrix().searchMatrix(new int[][]{{1}, {3}, {5}}, 5));
//        System.out.println(new Solution74SearchA2DMatrix().searchMatrix(new int[][]{{1, 3}}, 1));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        int middle = 0;
        int row = 0;
        int col = 0;

        while (left <= right) {
            middle = left + (right - left) / 2;
            row = middle / cols;
            col = middle % cols;
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}


