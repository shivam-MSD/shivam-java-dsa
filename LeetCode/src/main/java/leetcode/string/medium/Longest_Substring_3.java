package leetcode.string.medium;

/*
Given a string s, find the length of the longest
substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */

public class Longest_Substring_3 {
    String s = "bbbb";

    public Longest_Substring_3() {
        System.out.println("2 - Result :- " + lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        String s2 = String.valueOf(s.charAt(0));
        int i = 1;
        int maxlength = 1;
        int changemaxlength = 1;
        while (i < s.length()) {

            if (s2.contains(String.valueOf(s.charAt(i)))) {
                s2 = String.valueOf(s2.charAt(s2.length()-1));
                if(s2.length() != 0 && (s.charAt(i) == s2.charAt(0)))
                {
                    s2 = "";
                }
                maxlength = 1;
            }
            s2 = s2.concat(String.valueOf(s.charAt(i)));
            if (maxlength < s2.length() ) {
                maxlength++;
            }

            if(changemaxlength < maxlength)
            {
                changemaxlength = maxlength;
            }
            i++;
        }
        return changemaxlength;
    }
}
