public class Bruch {
    private final long zähler;
    private final long nenner;

    public Bruch(long zähler, long nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public String toString() {
        return zähler + "/" + nenner;
    }
}
