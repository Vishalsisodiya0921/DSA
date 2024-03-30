package Array_List;
import java.util.*;
public class SortingArrayList {
    public static void Swap(ArrayList<Integer> list,int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);//Ascending
        System.out.println(list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
