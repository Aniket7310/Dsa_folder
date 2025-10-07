import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //System.out.print("Enter arry element =");
        for(int i = 0;i<n;i++){
             System.out.print("Enter arry element =");
        arr[i] = sc.nextInt();
        }
        // for(int i = 0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
    //      int maxi = arr[0];
    //     int mini = arr[0];
    //     for (int i = 1; i < n; i++) {
    //         if (arr[i] > maxi) {
    //             maxi = arr[i];
    //         }
    //         if (arr[i] < mini) {
    //             mini = arr[i];
    //         }
    //     }
    //     System.out.println("Maximum element: " + maxi);
    //     System.out.println("Minimum element: " + mini);

      sc.close();

               int index = n-2; //delete karne wali ya shift karne wali index

        System.out.println("Before deletion:");
        for (int i = 0; i < arr.length; i++) {     //array ko hold kar ke rakhe ga
             System.out.print(arr[i] + " ");
            }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];                           //shift karne ke lia 
        }

        System.out.println("\nAfter deletion:");
        for (int i = 0; i < arr.length - 1; i++) { // print till size-1
            System.out.print(arr[i] + " ");
        }

            // int delete_index = 0;
            // System.out.println("before deletion");
            // for(int i=0; i<n;i++){

            // }
            // if ()



    }
}
