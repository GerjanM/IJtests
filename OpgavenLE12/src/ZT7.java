public class ZT7 {
    private String deZin = "";

    //constructor 2
    public Zin(String[] woorden) {
        int lengte = woorden.length;
        for (int i = 0; i < lengte; i++) {
            deZin = deZin + woorden[i];
        }
    }

    private int telAantalKeer(char c) {
        int aantalKeer = 0;
        int lengteZin = deZin.length();
        for (int i = 0; i < lengteZin; i++) {
            if (deZin.charAt(i) == c) {
                aantalKeer++;
            }
        }
        return aantalKeer;
    }
}