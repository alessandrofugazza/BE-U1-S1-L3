package classes;

public class SIM {
    private static class SingleCall {
        final private int duration;
        final private int phoneNumber;
        public SingleCall(int duration, int phoneNumber) {
            this.duration = duration;
            this.phoneNumber = phoneNumber;
        }

    }
    final private int phoneNumber;
    private int credit;
    private SingleCall[] recentCalls;

    public SIM(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0;
        this.recentCalls = new SingleCall[5];
    }

    public void printSIMData() {
        System.out.println("Phone #: " + this.phoneNumber);
        System.out.println("Credit: " + this.credit);
        System.out.println("Last 5 calls:");
        for (int i = 0; i < this.recentCalls.length; i++) {
            System.out.println("\tCall " + (i+1) + ":");
            System.out.println("\t\tDuration: " + this.recentCalls[i].duration);
            System.out.println("\t\tPhone #: " + this.recentCalls[i].phoneNumber);
        }
    }
    public void addCredit(int credit) {
        this.credit += credit;
    }

    public void addRecentCall(int duration, int phoneNumber, int index) {
        this.recentCalls[index] = new SingleCall(duration, phoneNumber);
    }

    public int getCredit() {
        return credit;
    }
}
