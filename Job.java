package Greedy_Algorithm;
import java.util.*;
public class Job {
    static class Job {
        int deadLine;
        int profit;
        int id;
        public Job(int i, int d, int p){
            id = i;
            deadLine = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][1], jobsInfo[i][0]));
        }
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit); // descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            while (curr.deadLine - 1 >= time && time >= 0) {
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("Max Jobs: " + seq.size() + " ");
        for(int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}

