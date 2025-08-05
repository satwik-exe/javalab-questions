package Lab7;

import java.util.Scanner;

public class lab7_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();
        System.out.println("The string after changing the case is: " + changeCase(inputString));

        System.out.println("The string after reversing is: " + reverseString(inputString));

        System.out.print("Enter the second string for comparison: ");
        String secondString = scanner.nextLine();
        compareStrings(inputString, secondString);

        System.out.print("Enter the string to be inserted into the first string: ");
        String insertString = scanner.nextLine();
        System.out.println("The string after insertion is: " + insertString(inputString, insertString));

        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        checkCharacterPosition(inputString, character);

        checkPalindrome(inputString);


    }

    private static String changeCase(String str) {
        StringBuilder changedCase = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                changedCase.append(Character.toLowerCase(c));
            } else {
                changedCase.append(Character.toUpperCase(c));
            }
        }
        return changedCase.toString();
    }

     static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

     static void compareStrings(String str1, String str2) {
        int difference = str1.compareTo(str2);
        System.out.println("The difference between ASCII value is: " + Math.abs(difference));
    }

     static String insertString(String original, String toInsert) {
        return original + " " + toInsert;
    }

     static void checkCharacterPosition(String str, char ch) {
        int position = str.indexOf(ch);
        if (position != -1) {
            System.out.println("Position of entered character: " + position);
        } else {
            System.out.println("Entered character is not present");
        }
    }

     static void checkPalindrome(String str) {
        String reversed = reverseString(str);
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }

    static void countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                break;
            }
        }
    }


}