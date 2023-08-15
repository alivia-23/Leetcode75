package String;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated
 * with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 */
public class GCDOfString {
    public static String gcdOfString(String s1, String s2) {
        if (!((s1 + s2).equals(s2 + s1))) {
            return "";
        }
        int n = s1.length();
        int m = s2.length();

        return s1.substring(0, gcd(n, m));
    }

    public static int gcd(int n1, int n2) {
        if (n2 > n1) {
            return gcd(n2, n1);
        }
        while (n2 != 0) {
            int quotient = n2;
            n2 = n1 % n2;
            n1 = quotient;
        }
        return n1;
    }

    public static void main(String[] args) {
      //  String s1 = "LEET";
      //  String s2 = "CODE";
        String s1 = "ABABAB";
        String s2 = "ABAB";
        String result = gcdOfString(s1, s2);
        System.out.println(result);
    }
}
