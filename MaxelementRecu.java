 import java.util.Scanner;
 public class MaxelementRecu {
    static int findMax(int[] arr, int n) {
        if (n == 1) return arr[0]; //bass tarika 
        return Math.max(arr[n - 1], findMax(arr, n - 1)); //call kar raha hi
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = findMax(arr, n);
        System.out.println(max);
    }
}

