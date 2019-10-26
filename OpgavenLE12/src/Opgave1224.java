public class Opgave1224 {
    public static int geefRijSom(int index) {
        int som = 0;
        int[][] matrixgm = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        for (int j = 0; j < matrixgm[index].length; j++) {
            som = som + matrixgm[index][j];
        }
        return som;
    }

    public static int geefKolomSom(int index) {
        int som = 0;
        int[][] matrixgm = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        for (int i = 0; i < matrixgm.length; i++) {
            //for (int i = 0; i < 3; i++) {
            som = som + matrixgm[i][index];
        }
        return som;
    }

    //Onderstaande kan beter door methode geefRijSOm (zie bovenstaand) te gebruikn. Zie ook boek:
    public static int[] geefRijSommen() {
        int[][] matrixgm = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        int afmetingAantalRijen = matrixgm.length;
        int[] rijSom = new int[afmetingAantalRijen];
        //int som = 0;
        for (int i = 0; i < afmetingAantalRijen; i++) {
            int som = 0;
            for (int j = 0; j < matrixgm[i].length; j++) {
                som = som + matrixgm[i][j];
                rijSom[i] = som;
            }
        }
        return rijSom;
    }


    public static int geefTotaal() {
        int[][] matrixgm = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}};
        int totaal = 0;
        int[] matGeefRijSommen = geefRijSommen();
        int afmeting = matGeefRijSommen.length;
        for (int i = 0; i < afmeting; i++) {
            totaal = totaal + matGeefRijSommen[i];
        }
        return totaal;
    }
}