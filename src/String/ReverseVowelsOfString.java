package String;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 *
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class ReverseVowelsOfString {
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i'||c == 'A'
                || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        char[] chs = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isVowel(chs[start])) {
                start++;
            }
            if (!isVowel(chs[end])) {
                end--;
            }
            if (isVowel(chs[start]) && isVowel(chs[end])) {
                swap(chs, start, end);
                start++;
                end--;
            }
        }
        return String.valueOf(chs);
    }

    public static void swap(char[] chs, int start, int end) {
        char temp = chs[start];
        chs[start] = chs[end];
        chs[end] = temp;
    }

    public static void main(String[] args) {
        String s = "hello";
        String reverseString = reverseVowels(s);
        System.out.println(reverseString);
    }
}
