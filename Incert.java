public class Incert {
    public static void main(String[] args) {
        int[] arr = new int[10]; 
        int[] arr = {10,20,30,40,50};
        int n=5;
        int idx=3;
        int ele = 100;
        System.out.println("before");
        for(int i = 0;i < n; i++){
                System.out.println(arr[i]+ " ");
        }
        for (int i = n; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
            arr[idx] = ele;
             n++;
        System.out.println("\nAfter Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
