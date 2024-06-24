package leetcode.string.easy;

public class Length_of_Last_Word_58 {
    String s = "   fly me   to   the moon  ";
    public Length_of_Last_Word_58() {
        System.out.println("58 - Result :- " + lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");

        return words[words.length-1].length();
    }
}
