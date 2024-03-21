package String;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0; int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        //String word1 = "abc";
        //String word2 = "pqr";
        String word1 = "abc";
        String word2 = "ahbgdc";
        boolean result = isSubsequence(word1, word2);
        System.out.println(result);
    }

}
