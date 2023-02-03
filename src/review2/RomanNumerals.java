package review2;

import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    /*
    Roman Numerals

	Create a method that will accept a roman numeral as a String and convert the it to the decimal number

	Here are some roman numeral benchmarks:
		I = 1
		V = 5
		X = 10
		L = 50
		C = 100
		D = 500
		M = 1000

	To represent a number use a combination of the numerals

	Rule: No roman numeral can be repeated more than three times in a row, which means subtraction is used between the numbers

		I = 1
		II = 2
		III = 3
		IIII --> NOT VALID, the I cannot be repeated more than three times
		IV = 4 --> correct way to represent 4 because: 5 - 1 = 4
		V = 5
		VI = 6
		VII = 7
		VIII = 8 --> 5 + 1 + 1 + 1
		VIIII --> NOT VALID
		IX = 9 --> 10 - 1 = 9
		X

	Test Data:

        IV -> 4
        X -> 10
        LII -> 52
        CXXXIV -> 134
        DXXI -> 521
        CCCXXI -> 321
        MMXXIII -> 2023


     */

    public static int convertNumber(String romanNum){

        int num = 0;

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for(int i = 0; i < romanNum.length(); i += 2){ // LII
            int firstValue = map.get(romanNum.charAt(i)); // 1

            if(i == romanNum.length() - 1){
                num += firstValue;
                break;
            }

            int secondValue = map.get(romanNum.charAt(i + 1)); // 5

            if(firstValue < secondValue){
                num += secondValue - firstValue;
            } else {
                num += firstValue + secondValue;
            }
        }
        return num; // 134
    }

    public static void main(String[] args) {
        System.out.println(convertNumber("CXXXIV"));
        System.out.println(convertNumber("MMXXIII"));
    }

}
