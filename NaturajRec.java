public class NaturajRec {
    
//     static void printNumbers(int n) {
//         if (n == 0) { 
//             return;
//         }
//         System.out.println(n);  //pahele print
//         printNumbers(n - 1);  //baad me rec call hoga
//     }

//     public static void main(String[] args) {
//         int n = 5;  // example
//         printNumbers(n);
//     }
// }

    static void printNumbers(int n) {
        if (n == 0) {   // base case
            return;
        }
        printNumbers(n - 1);    // pahale recursive cll hoga
        System.out.print(n+" ");
       // System.out.print("        ");  // baad mein print
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
