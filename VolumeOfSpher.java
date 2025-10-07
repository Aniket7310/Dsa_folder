import java.util.Scanner;

public class VolumeOfSpher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input lene ke lia
        System.out.print("Enter radius =");
        double r = sc.nextDouble();
        double a = (4*3.14154 *r *r *r)/3;
        System.out.println(a);
         
//squre of a number
         Scanner so = new Scanner(System.in);//input lene ke lia
        System.out.print("Enter num =");
        int num = so.nextInt();
        System.out.println(num*num);
 sc.close();
    
    // int s=10;
    // int y=5;
    // int b=2;
    // double z = s*y*b;
    // System.out.println(z);
    }
    
    
}

