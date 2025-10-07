public class Array2d2 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int s = 0;

        int count = 0;
        for(int i = 0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                int num = A[i][j];
                s+=num;
                if(num%2==0){
                    count++;
                }
                System.out.println(num);
            }
        }
        System.out.println("sum of elementof 2d array :"+s);
        System.out.println("count of even are :" +count);
    }
}
