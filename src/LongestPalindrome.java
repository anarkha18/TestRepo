import java.util.Scanner;

/*
Every palindrome is either of odd length or even length.
An odd-length palindrome always has a single center character (like lengths 1, 3, 5, etc.).
An even-length palindrome always has two equal adjacent characters in the middle.
Our motive is to find these centers and expand to the left and right to check how long the palindrome is.

Step-by-Step Algorithm (Simple Explanation)

1. Take input
 - Ask the user to enter a string.
-If  the string is empty, print a message and stop.
2. Keep a variable
 - Create a variable called longestPalindrome.
 - Start with it as an empty string.
3. Check each character
 - Go through every character in the string.
 - For each character, assume it could be the center of a palindrome.
4. Check for two types of palindromes
 - For each character in the string find a:
 1. Odd-length palindrome
 Example: racecar (center is e)
 Expand from the same index (i, i).
 2. Even-length palindrome
 Example: abba (center is between the two bs)
 Expand from (i, i+1).
5. Expand around the center
 - While:
   Left index ≥ 0
   Right index < string length
   Characters at left and right are equal
    Keep expanding outward.
    When they stop matching, return the found palindrome.
6. Compare lengths
 - Compare odd and even palindrome lengths. (ie, of each iteration)
 - Pick the longer one.
 - Compare it with longestPalindrome.
 - Update if it is longer.
7. After checking all characters
 - Pint the longest palindrome found.
 */
public class LongestPalindrome {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String longestPalindrome = "";
        String s = sc.nextLine();
        if (s.isEmpty()) System.out.print("No palindrome, the string is empty ");

        for (int i =0; i < s.length(); i++){
            String oddPalindrome = findPalindrome(s, i, i);
            String evenPalindrome = findPalindrome(s, i, i+1);
            String subLongestPalindrome = (oddPalindrome.length() > evenPalindrome.length()) ? oddPalindrome : evenPalindrome;
            longestPalindrome = (subLongestPalindrome.length() > longestPalindrome.length()) ? subLongestPalindrome : longestPalindrome ;

        }
        System.out.println("longestPalindrome is :" + longestPalindrome );

    }

    public static String findPalindrome(String s, int left, int right){
        while(s != null && left >=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left+1, right);

    }
}
