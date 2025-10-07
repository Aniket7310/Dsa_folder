//mport java.util.Scanner;
public class Sum {

 public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the array size = ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // //System.out.print("Enter arry element =");
        // for(int i = 0;i<n;i++){
        //      System.out.print("Enter arry element =");
        // arr[i] = sc.nextInt();
        // int[] arr ={-6,8,14,-2,23,47,-7};
        //     int sum = 0;
        //     for(int i = 0;i < arr.length;i++){
        //         sum += arr[i];

        //     }
        //     System.out.println(sum);
        int[] arr ={-6,8,14,-2,23,47,-7};
            int mx = arr[0];
            for(int i = 0;i < arr.length;i++){
                if (arr[i]>mx) {
                    mx = arr[i];
                }
            
                    //System.out.println(mx);
            }
           System.out.println(" The maximum array is :" +mx);
          //  int[] arr ={-6,8,14,-2,23,47,-7};
            int mini = arr[0];
            for(int i = 0;i < arr.length;i++){
                if (arr[i]<mini) {
                    mini= arr[i];
                }
            
                    //System.out.println(mx);
            }
            System.out.println(" The maximum array is :" +mini);

        }
    }

