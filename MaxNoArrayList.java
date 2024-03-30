package Array_List;
import java.util.*;
public class MaxNoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        list.add(1);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }
        System.out.println("Max Element is : "+max);
    }
    
}
