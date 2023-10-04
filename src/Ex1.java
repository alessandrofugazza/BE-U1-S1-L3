import classes.Rettangolo;

public class Ex1 {
    public static void main(String[] args) {
        Rettangolo rect1 = new Rettangolo(3, 5);
        Rettangolo rect2 = new Rettangolo(5, 7);
        rect1.stampaRettangolo();
        rect1.stampaDueRettangoli(rect2);
    }
}
