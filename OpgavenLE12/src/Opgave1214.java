public class Opgave1214 {
    public static int laatsteVoorkomen(int getal, int[] getallen) {
        int indexLaatsteVoorkomen = -1;
        for (int g : getallen) {
            indexLaatsteVoorkomen++;
            if (g == getal) return indexLaatsteVoorkomen;
        }
        return -1;
    }
}
// deze is niet goed: berekent het eerste voorkomen, en niet het laatste. Moet met een gewone for opdracht.