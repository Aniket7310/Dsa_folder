public class FabonaciRecu {
//     //ye hai aam jindagi
//     public static void main(String[] args) {
//         int a=0,b=1;
//         int n= 5;
     

//         System.out.print("Fibonacci Series: ");
//         System.out.print(a + " " + b); 
//         for (int i = 2; i < n; i++) {
//            int c = a + b;        
//               System.out.print(" " + c);
//             a = b;          
//             b = c;
//         }
//     }
// }
//ye hai Recursive jindagi
    static int fib(int n) {
        if (n <= 1) return n;   
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print(fib(i) + " ");
    }
}



        
