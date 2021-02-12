import java.util.ArrayDeque;
import java.util.Deque;


public class Executor {
    Deque<Job> queue = new ArrayDeque<>();

    public void run() {
        while (true) {
            if (!queue.isEmpty()) {
                Job j = queue.pollFirst();
                System.out.println("job " + j.jobName + " " + j.execute());
            }
        }
    }

    public void add(Job job) {
        queue.offerLast(job);
    }


    public static void main(String[] args) {
        Executor e = new Executor();
        e.add(new Job("url", "password", "soda order"));

        e.run();
    }
}
