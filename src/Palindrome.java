import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    Queue<Character> myQueue;
    Stack<Character> myStack;

    public Palindrome() {
        myQueue = new LinkedList<>();
        myStack = new Stack<>();
    }

    void pushCharacter(char c) {
        myStack.push(c);
    }

    void enqueueCharacter(char c) {
        myQueue.add(c);
    }

    char popCharacter() {
        return myStack.pop();
    }

    char dequeueCharacter() {
        return myQueue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("A palindrome is a word that is spelled the same forward and backward");
        System.out.println("Enter a word and I will tell you if it is a palindrome");
        System.out.println("i.e. the word 'racecar'");
        System.out.println();
        String input = scan.nextLine();
        scan.close();
        char[] s = input.toCharArray();
        Palindrome p = new Palindrome();
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);

        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Finally, print weather the input string is or is not a palindrome.
        System.out.println("The word " + input + " is " + (  (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );


    }
}
