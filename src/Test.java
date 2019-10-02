public class Test {
    public static void main(String[] args) {

        Math math1 = new Math();
        boolean c = math1.isEven(2);
        System.out.println("liczba parzysta = " + c);
        boolean d = math1.isEven(3);
        System.out.println("liczba nieparzysta = " + d);

        Math math2 = new Math();
        boolean e = math2.isOdd(2);
        System.out.println("liczba parzysta = " + e);
        boolean f = math2.isOdd(3);
        System.out.println("liczba nieparzysta = " + f);

        Math math3 = new Math();
        double P = math3.circleField(5);
        System.out.println("Pole koła = " + P);

        Math math4 = new Math();
        int g = math4.power(6);
        System.out.println("Kwadrat a = " + g);
    }
}

