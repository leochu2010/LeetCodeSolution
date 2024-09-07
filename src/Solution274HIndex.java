import java.util.Arrays;

public class Solution274HIndex {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1, 1, 3}));
//        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        if (citations.length == 1) {
            if (citations[0] > 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int validH = 0;
        for (int h = 1 ; h < citations.length + 1; h++) {
            if (citations[citations.length - h] >= h) {
                validH = h;
            }else{
                break;
            }
        }
        return validH;
    }
}
