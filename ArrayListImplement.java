package Array_List;
import java.util.*;
public class ArrayListImplement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Boolean> list2 = new ArrayList<>();
        //ArrayList<String>list3 = new ArrayList<>();

        //Add Element : O(1)
        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1,9);//O(n)
        System.out.println(list);

        //Get Operation/Element : O(1)
        int element = list.get(2);
        System.out.println(element);

        //Delete : O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index : O(n)
        list.set(2,10);
        System.out.println(list);

        //Contains Element : O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
