import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no a = ");
        int a = sc.nextInt();
        System.out.print("Enter the no b = ");
        int b = sc.nextInt();
        System.out.print("Enter the no c  = ");
        int c = sc.nextInt();
        // if(a+b+c==180)System.out.println("all value make a traingle");
        // else System.out.println("not a tringle");
        if (a+b>c&&b+c>a&&c+a>b)System.out.println("this is traingle");
        else  System.out.println("not a traingle");
        sc.close();


    }
    
}
