import java.util.*;

public class Solution49GroupAnagrams {

    public static void main(String[] args) {

        System.out.println(new Solution49GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] strchars = new int[strs.length][26];
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (char aChar : chars) {
                strchars[i][aChar - 'a'] += 1;
            }
        }

        Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String fingerprint = Arrays.toString(strchars[i]);
            groupMap.putIfAbsent(fingerprint, new ArrayList<String>());
            groupMap.get(fingerprint).add(strs[i]);
        }

        return new ArrayList<>(groupMap.values());
    }
}
