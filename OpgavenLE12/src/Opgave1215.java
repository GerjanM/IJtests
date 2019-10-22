public class Opgave1215 {
    public static int aantalPositief(int[] getallen) {
        int som = 0;
        for (int g : getallen) {
            if (g > 0) {
                som++;
                System.out.println(som);
            }

        }
        return som;
    }
}
