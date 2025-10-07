import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("enter the num = ");
        int num = sc.nextInt();
        if (num<0)
            System.out.println(-1*num);
            // System.out.println("no is absolute");
        
        else System.out.println(num);
            // System.out.println("no is already absolute");
             sc.close();
        
    }
}
