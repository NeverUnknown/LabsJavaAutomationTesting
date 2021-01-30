import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner inD = new Scanner(System.in);
        System.out.println("Enter Fahrenheit -> ");
        System.out.println(celsiusToFahrenheit(inD.nextDouble()));

        Scanner inI = new Scanner(System.in);
        System.out.println("Enter number to reverse -> ");
        System.out.println(reverse(inI.nextInt()));

        System.out.println("Enter number to know if it is a palindrome -> ");
        System.out.println(isPalindrome(inI.nextInt()));

        System.out.println("Enter number for palindrome -> ");
        palindromeNumber(inI.nextInt());

        inD.close();
        inI.close();

        countVowelsAndConsonants("Bruh, look at this dude!");
    }

    //Ex1

    /**
     * @param d double
     * @return double
     */
    public static double celsiusToFahrenheit(double d) {
        return (1.8d * d + 32);
    }

    //Ex2

    /**
     * @param num int
     */
    public static void palindromeNumber(int num) {
        System.out.println(isPalindrome(num) ? num + " is a palindrome" : num + " isn't palindrome");
    }

    //Ex3

    /**
     * @param s String
     */
    public static void countVowelsAndConsonants(String s) {
        Pattern p1 = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE), p2 = Pattern.compile("[b-df-hj-np-tv-xz]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(s), m2 = p2.matcher(s);
        int vowels = 0, consonants = 0;
        while (m1.find()) {
            vowels++;
        }
        while (m2.find()) {
            consonants++;
        }
        System.out.println("Vowels = " + vowels + "\nConsonants = " + consonants);
    }

    //Ex4

    /**
     * @param num int
     * @return int
     */
    public static int reverse(int num) {
        StringBuilder numRev = new StringBuilder(((Integer) num).toString());
        numRev = numRev.reverse();
        return Integer.parseInt(String.valueOf(numRev));
    }

    /**
     * @param num int
     * @return boolean
     */
    public static boolean isPalindrome(int num) {
        return reverse(num) == num;
    }

    //___________________________________________________________________________Extra Ex______________________________________________________________________________


}
