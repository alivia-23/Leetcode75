package String;

import java.util.Set;

/**
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * Example 1:
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */
public class MaxVowels {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int maxVowels = 0; // result count of max no. of vowels in a substring of given length
        int start = 0; // hold a pointer to the starting point of the window
        int count = 0; // hold a global count for no. of vowels upto cur end pointer
        for (int end = 0; end < s.length(); end++) {
            char curChar = s.charAt(end);
            if (vowels.contains(curChar)) {
                count++;
            }
            if (end >= k - 1) {
                // update maxVowels by the larger count
                maxVowels = Math.max(maxVowels, count);
                // before sliding window check if the leaving char pointed by start is vowel or not
                // if leaving char pointed at start is a vowel decrement our global count
                // so that we can keep track of the count of vowels of the next substring window
                if (vowels.contains(s.charAt(start))) {
                    count--;
                }
                // slide the window by shifting start to the next char
                start++;
            }
        }
        return maxVowels;

    }
}
