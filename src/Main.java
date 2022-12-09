import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        // create an ActivityTracker object
        ActivityTracker tracker = new ActivityTracker(goal);

        // repeatedly ask user to enter an activity session's number of minutes
        // and enter -1 when done entering
        int newSession = 1;
        while (newSession > 0) {
            System.out.print("Enter the number of minutes for your session or -1 to stop: ");
            newSession = scan.nextInt();
            if (newSession > 0) {
                tracker.logMinutes(newSession);
            }
        }

        // log the number of minutes associated with each activity session

        // when the user is done entering numbers, end the loop and
        // tell the user their stats:
        System.out.println("Number of sessions: " + tracker.getSessions());
        System.out.println("Total number of minutes: " + tracker.getTotalMinutes());
        System.out.println("Longest session: " + tracker.getMaxMinutes());
        System.out.println("You have" + (tracker.goalAchieved() ? "" : " not") + " achieved your goal");
        // - total sessions logged
        // - total minutes logged
        // - max minutes logged
        // - did they reach their goal?

    }
}
