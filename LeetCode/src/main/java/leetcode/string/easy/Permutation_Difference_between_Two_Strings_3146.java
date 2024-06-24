package leetcode.string.easy;

/*
// Question
You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of the
occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.



Example 1:

Input: s = "abc", t = "bac"

Output: 2

Explanation:

For s = "abc" and t = "bac", the permutation difference of s and t is equal to the sum of:

The absolute difference between the index of the occurrence of "a" in s and the index of the occurrence of "a" in t.
The absolute difference between the index of the occurrence of "b" in s and the index of the occurrence of "b" in t.
The absolute difference between the index of the occurrence of "c" in s and the index of the occurrence of "c" in t.
        That is, the permutation difference between s and t is equal to |0 - 1| + |2 - 2| + |1 - 0| = 2.

Example 2:

Input: s = "abcde", t = "edbac"

Output: 12

Explanation: The permutation difference between s and t is equal to
    |0 - 3| + |1 - 2| + |2 - 4| + |3 - 1| + |4 - 0| = 12.

Logic :-
    Approach 1 :-
        a b c       b a c
        0 1 2       0 1 2
        0 1 2       1 0 2
 */
public class Permutation_Difference_between_Two_Strings_3146 {
    String s;
    String t;

    public Permutation_Difference_between_Two_Strings_3146() {
        this.s = "abc";
        this.t = "bac";
        System.out.println("3146 - Result :- "+this.findPermutationDifference(s,t));

    }

    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        int[] arr1 = new int[s.length()];
        int[] arr2 = new int[t.length()];

        for(int i = 0;i<s.length();i++)
        {
            arr1[i] = i;
        }

        for(int i = 0;i < t.length();i++)
        {
            for(int j = 0;j<arr1.length;j++)
            {
                if(s.charAt(j) == t.charAt(i))
                {
                    arr2[i] = s.indexOf(s.charAt(j));
                }
            }
        }
        return findDifferenceAndSumThemAll(arr1,arr2);
    }

    private int findDifferenceAndSumThemAll(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            sum += positiveDifference(arr1[i],arr2[i]);
        }

        return sum;
    }

    private int positiveDifference(int num1, int num2)
    {
        int diff = num1-num2;
        return diff < 0 ? -1*diff : diff;
    }
}
