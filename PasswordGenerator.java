import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PasswordGenerator {
    public static String Generate() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //User says how many Cap & Low Letters, Nums, and Syms
        System.out.println("Input Number of Capital Letters: ");
        int  capitalLetterInput = sc.nextInt();
        System.out.println("Input Number of Lowercase Letters: ");
        int  lowerLetterInput = sc.nextInt();
        System.out.println("Input Number of Numbers: ");
        int  numberInput = sc.nextInt();
        System.out.println("Input Number of Symbols: ");
        int  symbolInput = sc.nextInt();
        String password = "";

        //adds random items to the final output
        //adds a random Capital letter depending on what number the user stated
        for ( int count=0; count<capitalLetterInput; count++) {
            password += (char)getRandInt(65,91);
        }

        //adds a random Lower letter depending on what number the user stated
        for ( int count=0; count<lowerLetterInput; count++) {
            password += (char)getRandInt(97,122);
        }

        //adds a random Number depending on what number the user stated
        for ( int count=0; count<numberInput; count++) {
            password += (char)getRandInt(48, 57);
        }

        //adds a random Symbol depending on what number the user stated
        int special = 0;
        String symbolsDigit = "";
        while (!(symbolInput == 0)) {
            special = getRandInt(33,64);
            if ((special == 33) || (special == 35) || (special == 36) || (special == 37) || (special == 38) || (special == 40) || (special == 41) || (special == 42) || (special == 64)) {
                password += (char) special;
                symbolInput -= 1;
            }
        }
        // https://stackoverflow.com/questions/4247810/scramble-a-word-using-java
        // A list of each index for the Generated Password
        ArrayList<Character> chars = new ArrayList<Character>(password.length());
        for ( char c : password.toCharArray() ) {
        chars.add(c);
        }
        Collections.shuffle(chars);
        char[] shuffled = new char[chars.size()];
        for ( int i = 0; i < shuffled.length; i++ ) {
        shuffled[i] = chars.get(i);
        }
        String ShuffledPassword = new String(shuffled);

        return ShuffledPassword;
    }

    private static int getRandInt(int minimum, int maximum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

}