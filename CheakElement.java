public class CheakElement {
    public static void main(String[] args) {
       // int[] arr = {10, 20, 30, 40, 50};
        int[] arr = {1,1,2,3,4,5,6};
        int key = 20;           //Targate
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        System.out.println("present :"+found); 
    }
}


