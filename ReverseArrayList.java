package Array_List;
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> least = new ArrayList<>();  
        least.add(1);
        least.add(2);
        least.add(3);
        least.add(4);
        least.add(5);

        //Reverse Array List...O(n)
        for(int i=least.size()-1;i>=0;i--){
            System.out.println(least.get(i)+" ");
        }
    }
}
