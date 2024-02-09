public class Main {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(2, 4);
        Bruch b3 = b1.add(b2);
        Bruch b4 = new Bruch(1, 3);
        Bruch b5 = new Bruch(4, 7);

        System.out.println( b1 + " + " + b2 + " = " + b3 );
        System.out.println( b1 + " + " + b4 + " = " + b1.add(b4) );
        System.out.println( b4 + " + " + b1 + " = " + b4.add(b1) );
        System.out.println( b2 + " + " + b5 + " = " + b2.add(b5) );
    }

}
