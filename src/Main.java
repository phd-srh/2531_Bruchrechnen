public class Main {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(2, 4);
        Bruch b3 = b1.add(b2);

        System.out.println( b1 + " + " + b2 + " = " + b3 );
    }

}
