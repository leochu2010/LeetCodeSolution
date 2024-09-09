import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution383RansomNote {
    public static void main(String[] args) {
        System.out.println(new Solution383RansomNote().canConstruct("a", "b"));
        System.out.println(new Solution383RansomNote().canConstruct("aa", "ab"));
        System.out.println(new Solution383RansomNote().canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Integer, Long> magazineMap =
                magazine.chars().boxed()
                        .collect(
                                Collectors.groupingBy(Function.identity(), Collectors.counting())
                        );

        for (int c : ransomNote.chars().toArray()) {
            if (magazineMap.getOrDefault(c, 0L) == 0) {
                return false;
            } else {
                magazineMap.put(c, magazineMap.get(c) - 1);
            }
        }
        return true;
    }
}
