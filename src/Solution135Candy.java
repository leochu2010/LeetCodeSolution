import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution135Candy {
    public static void main(String[] args) {
//        new Solution135Candy().candy(new int[]{1, 0, 2});
//        new Solution135Candy().candy(new int[]{1, 2, 2});
        new Solution135Candy().candy(new int[]{1, 3, 2, 2, 1});
//        new Solution135Candy().candy(new int[]{1, 3, 4, 5, 2});
    }

    private int countCandyPotion(int[] ratings, int from, int to) {
        int[] potionRatings = new int[Math.abs(from - to) + 1];
        if (from < to) {
            int p = 0;
            for (int i = from; i < to + 1; i++, p++) {
                potionRatings[p] = ratings[i];
            }
        } else {
            int p = 0;
            for (int i = from; i > to - 1; i--, p++) {
                potionRatings[p] = ratings[i];
            }
        }

        int[] candies = new int[potionRatings.length];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = 1;
        }
        for (int i = 0; i < potionRatings.length - 1; i++) {
            if (potionRatings[i + 1] > potionRatings[i]) {
                candies[i + 1] = candies[i] + 1;
            } else {
                candies[i + 1] = 1;
                //go back
                for (int j = i + 1; j > 0; j--) {
                    if (potionRatings[j - 1] > potionRatings[j]) {
                        if (candies[j - 1] <= candies[j]) {
                            candies[j - 1] = candies[j] + 1;
                        }
                    }
                }
            }
        }
        int canyCount = Arrays.stream(candies).sum();
        System.out.printf("from:{%d}, to:{%d}, candies:{%d}%n", from, to, canyCount);
        System.out.println(Arrays.toString(potionRatings));
        System.out.println(Arrays.toString(candies));
        return canyCount;
    }

    private int countCandy(int[] ratings, int startIndex) {
        return countCandyPotion(ratings, startIndex, ratings.length - 1)
                + countCandyPotion(ratings, startIndex, 0) - 1;
    }

    public int candy(int[] ratings) {
        int minRate = Arrays.stream(ratings)
                .min()
                .orElse(0);
        System.out.println(minRate);

        System.out.println(Arrays.toString(ratings));
        List<Integer> candies = new ArrayList<Integer>();
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == minRate) {
                int candyCount = countCandy(ratings, i);
                System.out.printf("count candy for {%d}:{%d}%n", i, candyCount);
                candies.add(candyCount);
            }
        }
        return Collections.min(candies);
    }
}
