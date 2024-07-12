package javacodingquestions;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println(str1 + " is palindrome? " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome? " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
