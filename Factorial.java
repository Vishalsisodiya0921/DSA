package Recursion;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnum = fact(n-1);
        int fn = n * fnum;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(" "+fact(n));
    }
}
