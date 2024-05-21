package Recursion;
public class SumOfN {
    public static int calSum(int n){
        if(n == 1){
            return 1;
        }
        int sn1 = calSum(n-1);
        int sum = n + sn1;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" "+calSum(n));
    }
}
