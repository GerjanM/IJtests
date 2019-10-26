public class Opdracht1223 {

    public static void liedPrint(String[][] liedje) {
        for (int i = 0; i < liedje.length; i++) {
            for (int j = 0; j < liedje[i].length; j++) {
                System.out.print(liedje[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
