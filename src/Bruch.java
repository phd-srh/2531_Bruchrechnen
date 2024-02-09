public class Bruch {
    private final long zähler;
    private final long nenner;

    public Bruch(long zähler, long nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public Bruch add(Bruch b) {
        long neuerZähler = this.zähler * b.nenner + b.zähler * this.nenner;
        long neuerNenner = this.nenner * b.nenner;
        return new Bruch(neuerZähler, neuerNenner).kürze();
    }

    public Bruch kürze() {
        long neuerZähler = this.zähler;
        long neuerNenner = this.nenner;
        // TODO
        return new Bruch(neuerZähler, neuerNenner);
    }

    public String toString() {
        return zähler + "/" + nenner;
    }
}
