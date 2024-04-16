package BinaryTreeP1;
import java.util.*;
public class TreeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 1000000007;

        while(true){
            int H = sc.nextInt();
            if(H==0)
            break;

            int numberOfNodes = (1<<H)-1;
            int[] tree = new int[numberOfNodes+1];

            for(int i=1;i<=numberOfNodes;i++){
                tree[i] = sc.nextInt();
            }
            //Product of each node
            for(int i=numberOfNodes/2;i>=1;i--){
                int leftChild = 2*i;
                int rightChild = 2*i+1;
                tree[i] = Math.max((int)(((long)tree[i]*tree[leftChild])%MOD),(int)(((long)tree[i]*tree[rightChild])%MOD));
            
        }
        //result for p1
        System.out.println(tree[1]);
    }
    sc.close();
}
}
