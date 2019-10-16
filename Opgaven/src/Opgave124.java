public class Opgave124 {
    public static int indexEersteA(String s) {
        int lengteString = s.length();
        int eersteA = -1;
        for (int i = 0; i < lengteString; i++) {
            String letter = String.valueOf(s.charAt(i));
            if (eersteA == -1 && (letter.equals("A") || letter.equals("a"))) {
                eersteA = i;
            }
        }
        return eersteA;
    }
}


