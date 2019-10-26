import java.awt.*;

public class OpgavenTester {
    public static void main(String[] args) {
        //System.out.println(Opgave124.indexEersteA("Gerjan Maas"));
        //System.out.println(Opgave124.indexEersteA("Mien Maas"));
        //System.out.println(Opgave125.lengteLangsteZin("Retourneert lengte langste zin. De zinnen kunnen heel lang zijn, maar nie                         t oneindig lang. Wat is een korte zin."));

        //Breuk half = new Breuk(1, 2);
        //Breuk kwart = half.maal(half);
        //Breuk produkt = half.maal(kwart);
        //System.out.println(half);
        //System.out.println(kwart);
        //System.out.println(produkt);
        //System.out.println(Faculteit.faculteit(3));
        //System.out.println(Faculteit.faculteit(6));
        //int[] getalrij = {1, 2, 3, 4, -1, 12, -13, 14};
        //System.out.println(Opgave1214.laatsteVoorkomen(4,getalrij));
        //System.out.println(Opgave1215.aantalPositief(getalrij));
        //Opgave1217.hoogOp(getalrij);
        //String[][] liedje = {
        //  {"een", "twee", "drie", "vier"},
        //  {"hoedje", "van", "hoedje", "van"},
        //  {"een", "twee", "drie", "vier"},
        //  {"hoedje", "van", "papier"}
        //};
        //Opdracht1223.liedPrint(liedje);
        //
        //System.out.println(Opgave1224.geefRijSom(1));
        //System.out.println(Opgave1224.geefKolomSom(1));
        //System.out.println(Opgave1224.geefRijSommen()[0]);
        //System.out.println(Opgave1224.geefRijSommen()[1]);
        //System.out.println(Opgave1224.geefRijSommen()[2]);
        //System.out.println(Opgave1224.geefTotaal());
        int[] rijLinks = {1, 2, 3, 4};
        int[] rijRechts = {5, 6, 7, 8};

        Point[] ritsRij = ZT6.rits(rijLinks, rijRechts);
        int x = ritsRij[0].x;
        int y = ritsRij[0].y;
        String xString = String.valueOf(x);
        String yString = String.valueOf(y);
        System.out.println(xString + yString);

    }
}
