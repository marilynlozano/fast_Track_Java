package review1;

public class Pangram {
    /*
    Pangram

	Create a method that will check if a given String is a Pangram. A Pangram is when the text is built up of every letter in the alphabet at least once.

	Bonus: writing out pangrams can help practice typing

	Ex:
		the quick brown fox jumps over the lazy dog --> true
		the five boxing wizards jump quickly --> true
		abcdefghijklmnopqrstuvwxyz --> true
		bcdefghijklmnopqrstuvwxyz --> false
		hello world --> false
     */

    public static boolean isPangram(String str){

        String valid = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < str.length(); i++){
            valid = valid.replace(str.substring(i, i+1), ""); // "" + str.charAt(i)
            System.out.println("Checking this char: " + str.substring(i, i+1) + "  " + valid);
        }

        return valid.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isPangram("the five boxing wizards jump quickly"));
    }

}
