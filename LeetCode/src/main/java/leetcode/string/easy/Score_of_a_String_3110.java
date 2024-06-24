package leetcode.string.easy;

/*
 Question 3110 of string - easy
 You are given a string s. The score of a string is defined as the sum of the absolute
 difference between the ASCII values of adjacent characters.

Return the score of s.


Example 1:

Input: s = "hello"

Output: 13

Explanation:

The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111.
 So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

Example 2:

Input: s = "zaz"

Output: 50

Explanation:

The ASCII values of the characters in s are: 'z' = 122, 'a' = 97.
 So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.

*/

/*
    Logic :-

    Approach 1 :- calculate difference of each and add them

    Approach 2 :-

 */

public class Score_of_a_String_3110 {

    String input;

    public Score_of_a_String_3110()
    {
        this.input = "hello";
        System.out.println("3110 - Result :- "+this.scoreOfString(this.input));

    }

    public int scoreOfString(String s) {

        int sum = 0;
        int i = 0;
        while(i < s.length()-1)
        {
            sum += positiveDifferenceOfAdjacentChar(s.charAt(i),s.charAt(i+1));
            i++;
        }
        return sum;
    }

    private int positiveDifferenceOfAdjacentChar(char char1,char char2)
    {
        int diff = (int)char1 - (int)char2;
        return diff < 0 ? -1*diff : diff;
    }

}
