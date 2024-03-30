package Greedy_Algorithm;
import java.util.*;
public class ActivitySelectionByGreedy {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //sorting
        int activities[][] = new int [start.length][3];//3 bcz three col are taken: index,start,end
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lambda function ->shortform... 
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        //with sorting...
        ans.add(activities[0][0]); 
        int lastEnd = activities[0][2];
        for(int i=0;i<end.length;i++){
                if(activities[i][1]>=lastEnd){
                    //Activity selection
                    maxAct++;
                    ans.add(activities[i][0]);
                    lastEnd = activities[i][2];
                }
            }

        //without sorting
        //ans.add(0); 
        //int lastEnd = end[0];
        // for(int i=0;i<end.length;i++){
        //     if(start[i]>=lastEnd){
        //         //Activity selection
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        System.out.println("Max Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
