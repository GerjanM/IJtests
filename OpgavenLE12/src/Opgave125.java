public class Opgave125 {
    public static int lengteLangsteZin(String tekst){
        int puntpos = tekst.indexOf('.');
        int maxlen = puntpos + 1;
        int puntposvolgend = -1;

        for (puntpos = tekst.indexOf('.'); puntpos < tekst.length() - 1; puntpos = puntposvolgend) {
            puntposvolgend = tekst.indexOf('.', puntpos + 1);
            int lengteZin = puntposvolgend - puntpos;
            if (lengteZin > maxlen) {
                maxlen = lengteZin;
            }
        }
        return maxlen;
    }
}
