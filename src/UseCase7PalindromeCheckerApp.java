import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while(deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }

    }
}