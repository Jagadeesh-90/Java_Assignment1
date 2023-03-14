package assignment_2;

public class AlphabetChecker {
    public static boolean containsAllLetters(String input) {
        if (input == null) {
            return false;
        }
        input = input.toLowerCase();

        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }
        // check if all letters are present
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }

}
//Time complexity =O(n)   ->iterates loop once
//Space complexity =O(1) ->because the size of the alphabet array is fixed at 26,so size doesnot depend on size of inputq