package Array_List;
import java.util.*;
public class PairSum2By_2Pointer {//O(n)
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1; //Smallest
        int rp = bp;

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                //case3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11,15,6,8,9,10 - Sorted and Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
