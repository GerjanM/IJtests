public class OpgavenTester {
    public static void main(String[] args) {
        System.out.println(Opgave124.indexEersteA("Gerjan Maas"));
        System.out.println(Opgave124.indexEersteA("Mien Maas"));
        System.out.println(Opgave125.lengteLangsteZin("Retourneert lengte langste zin. De zinnen kunnen heel lang zijn, maar nie                         t oneindig lang. Wat is een korte zin."));

        Breuk half = new Breuk(1, 2);
        Breuk kwart = half.maal(half);
        Breuk produkt = half.maal(kwart);
        System.out.println(half);
        System.out.println(kwart);
        System.out.println(produkt);
    }
}
