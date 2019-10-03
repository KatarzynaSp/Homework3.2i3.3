public class Test {
    public static void main(String[] args) {

        Math math1 = new Math();
        boolean c = math1.isEven(2);
        System.out.println("liczba parzysta = " + c);
        boolean d = math1.isEven(3);
        System.out.println("liczba nieparzysta = " + d);
        boolean e = math1.isOdd(2);
        System.out.println("liczba parzysta = " + e);
        boolean f = math1.isOdd(3);
        System.out.println("liczba nieparzysta = " + f);
        double P = math1.circleField(5);
        System.out.println("Pole koła = " + P);
        int g = math1.power(6);
        System.out.println("Kwadrat a = " + g);
    }
}