import java.util.Scanner;
public class Power {
    static int power(int n, int k) {
        if (k == 0) {
            return 1; 
        }
        return n * power(n, k - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base n: ");
        int n = sc.nextInt();
        System.out.print("Enter power k: ");
        int k = sc.nextInt();
        sc.close();

        int result = power(n, k);
        System.out.println(n + " raised to the power " + k + " is: " + result);
    }
}

