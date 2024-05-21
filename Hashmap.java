package Hashing;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer>hm = new HashMap<>();
        //Insert
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US",50);

        System.out.println(hm);

        //Get -- O(1)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
