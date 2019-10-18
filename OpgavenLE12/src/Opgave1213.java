import java.util.Random;

public class Opgave1213 {

    public int[] arrayWorp() {
        int[] worp = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            worp[i] = random.nextInt(6) + 1;
        }
        return worp;
    }
}
