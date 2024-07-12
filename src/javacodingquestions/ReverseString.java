package javacodingquestions;

public class ReverseString {
        public static void main(String[] args) {
            String input = "hello";
            String reversed = reverseString(input);
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
        }

        public static String reverseString(String s) {
            char[] charArray = s.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                // Swap characters at left and right pointers
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Move pointers towards the center
                left++;
                right--;
            }

            // Convert char array back to string
            return new String(charArray);
        }
    }

