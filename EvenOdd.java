import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n = ");
        int n = sc. nextInt();
        //System.out.println("Enter the n = ");
        if (n%2==0)
            System.out.println("the no is even ");
        
        else
            System.out.println("the no is odd");
        
        sc.close();
    }
}
