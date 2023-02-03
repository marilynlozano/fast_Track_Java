package review2;

import java.util.ArrayList;
import java.util.List;

public class Word {
    String value;
    int vowels;
    int consonants;

    public Word(String value) { // word = apple

        int vowels = 0;
        int consonants = 0;

        String validVowels = "aeiou";

        for(int i = 0; i < value.length(); i++){
            if(validVowels.contains(value.substring(i, i+1))){ // "" +value.charAt(i)
                vowels++;
            } else {
                consonants++;
            }
        }

        this.vowels = vowels;
        this.consonants = consonants;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nWord: " + value  + " | vowels: " + vowels + " | consonants: " + consonants;
    }
}

class WordRunner {
    public static void main(String[] args) {
        List<Word> allWords = new ArrayList<>();
        String s = "the quick brown fox jumps over the lazy dog";

        for(String each: s.split(" ")){
            allWords.add(new Word(each));
        }

        System.out.println(allWords);
    }
}
