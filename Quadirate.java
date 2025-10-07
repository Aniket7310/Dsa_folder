import java.util.Scanner;

public class Quadirate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no X : ");
        int x = sc.nextInt();
        System.out.print("Enter the no Y : ");
        int y = sc.nextInt();
        if (x==0 && y==0)
        System.out.println("no lise on origin");
        else if (y==0 && x!=0)
        System.out.println("point lise on x axise");
         else if (y!=0 && x==0)
        System.out.println("point lise on y axise");
         else if (y>0 && x>0)
        System.out.println("point lise on first qadinate");
        else if (y>0 && x<0)
        System.out.println("point lise on second qadinate");
        else if (y<0 && x<0)
        System.out.println("point lise on third qadinate");
        else if (y<0 && x>0)
        System.out.println("point lise on four qadinate");
        sc.close();

    }
    
}
