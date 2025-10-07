import java.util.Scanner;

public class ProfiteLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter the no CP = ");
        double CP = sc.nextDouble();
        System.out.print("Enter the no SP = ");
        double SP = sc.nextDouble();
        if (CP>SP)System.out.println("loss is  "  +  (CP-SP));
        if(CP<SP)System.out.println("profite is "  + (SP-CP));
        if(CP==SP)System.out.println("nither loss nor profite");
sc.close();
    }
}
