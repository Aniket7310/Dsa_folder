import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  :");
        int x = sc.nextInt();
        sc.close();
        if(x%3==0  && x%5==0) {
            System.out.println("no is div by 3 and 5");
        }
     else if(x%3!=0 && x%5!=0) { 
       System.out.println("no is not div by 3 or 5 ");
    }
       else if ( x%5==0) {
        System.out.println("no is div by  5");
       }
        else {
         System.out.println("no is div by   3");
        }
    }
}

