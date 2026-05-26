
import java.util.*;
public class Q6{

   static class Job{
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs= new ArrayList<>();

        for(int i=0; i<jobInfo.length; i++){
          jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit);

        ArrayList<Integer> result = new ArrayList<>();
        int time = 0;
        for(Job job : jobs){
            if(time < job.deadline){
                result.add(job.id);
                time++;
            }
        }

        System.out.println("Jobs selected: " + result);
        for(int res : result){
            System.out.println("Job ID: " + res + ", Deadline: " + jobInfo[res][0] + ", Profit: " + jobInfo[res][1]);
        }

    }
}