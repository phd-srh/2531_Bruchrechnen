public class Main {

    public static void berechne(char operation, Bruch bruch1, Bruch bruch2) {
        System.out.print(bruch1 + " " + operation + " " + bruch2 + " = ");
        switch (operation) {
            case '+':
                System.out.println(bruch1.add(bruch2));
                break;
            case '-':
                System.out.println(bruch1.sub(bruch2));
                break;
            default:
                System.out.println("unbekannte Operation ");
        }
    }

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1, 2);
        Bruch b2 = new Bruch(2, 4);
        Bruch b4 = new Bruch(1, 3);
        Bruch b5 = new Bruch(4, 7);

        berechne('+', b1, b2);
        berechne('+', b1, b4);
        berechne('+', b4, b1);
        berechne('+', b2, b5);
        berechne('-', b1, b2);
        berechne('-', b1, b4);
    }

}
