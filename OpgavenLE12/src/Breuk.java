public class Breuk {
    private int teller, noemer;

    public Breuk(int t, int n) {
        teller = t;
        noemer = n;
    }

    public Breuk maal(Breuk b) {
        Breuk hulp = new Breuk(b.teller, b.noemer);
        hulp.teller = hulp.teller * teller;
        hulp.noemer = hulp.noemer * noemer;
        return hulp;
    }

    public String toString() {
        return teller + "/" + noemer;
    }
}
