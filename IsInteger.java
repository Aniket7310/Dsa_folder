import java.util.Scanner;

public class IsInteger {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no n = ");
    double n = sc.nextDouble();
    int x = (int)n;//here all real no convert into integer
    if(n-x==0)
    System.out.println("no is an integer");
    else
    System.out.println("no is not  integer");

 sc.close();
}

}
