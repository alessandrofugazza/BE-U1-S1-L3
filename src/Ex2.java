import classes.SIM;

public class Ex2 {
    public static void main(String[] args) {
        SIM sim = new SIM(12345);
        sim.addRecentCall(3, 147345234, 0);
        sim.addRecentCall(5, 987654321, 1);
        sim.addRecentCall(3, 463412345, 2);
        sim.addRecentCall(4, 436534611, 3);
        sim.addRecentCall(5, 253234114, 4);
        sim.printSIMData();
        sim.addCredit(4);
        System.out.println(sim.getCredit());
    }
}
