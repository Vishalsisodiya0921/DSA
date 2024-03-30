package Array_List;
import java.util.*;
public class PairSum1By_2Pointer {
    //2 pointer aproach..

    //case1: if (lp + rp == target) return true
    //case2: if (lp + rp < target) lp++
    //case3: if(lp + rp > target) rp--
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp =0;
        int rp = list.size()-1;

        while(lp!=rp){
            //case1 
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp) < target){
                lp++;
            }
            else if(list.get(lp)+list.get(rp) > target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 11;
        System.out.println(pairSum1(list, target));
    }
}
