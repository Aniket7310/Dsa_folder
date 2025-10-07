import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {1,2,3,4,5,6,02,23,0};
        // System.out.println(arr.length);
        int[] karan = new int [7];
        System.out.print("Enter the array");
        for(int i = 0; i< 7;i++){
            karan[i] = sc.nextInt();
            sc.close();
            
        }
    // for(int i = 0; i< 7;i++){
    //     System.out.println(2*karan[i]);
    //     System.out.println(2*karan[i]);
    // }
    }
}
