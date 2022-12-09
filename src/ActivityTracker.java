public class ActivityTracker {
    private int targetGoal;
    private int totalMinutes;
    private int sessions;
    private int longestSession;

    public ActivityTracker(int goal) {
        targetGoal = goal;
    }

    public void logMinutes(int amount) {
        totalMinutes += amount;
        sessions++;
        if (amount > longestSession) longestSession = amount;
    }

    public int getSessions() {
        return sessions;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return longestSession;
    }

    public boolean goalAchieved() {
        return totalMinutes >= targetGoal;
    }
}
