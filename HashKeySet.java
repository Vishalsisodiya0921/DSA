package Hashing;
import java.util.*;
public class HashKeySet {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Iterate
        //System.out.println(hm.entrySet());
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("keys="+k+",value="+hm.get(k));
        }
    }
}
