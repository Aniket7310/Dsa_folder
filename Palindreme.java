import java.util.Scanner;

public class Palindreme {
    static void checkPalindrome(String str) {
        if (str.length() <= 1) {   
            System.out.println("Palindrome");
            return;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            System.out.println("Not a Palindrome");
            return;
        }
        checkPalindrome(str.substring(1, str.length() - 1));
    }


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        checkPalindrome(str);
    }
}

