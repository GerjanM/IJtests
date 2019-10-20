public class Faculteit {
    public static int faculteit(int n) {
        //int i;
        int fac = n;
        for (n = n; n > 1; n = n - 1) {
            fac = fac * (n - 1);
            //System.out.println(fac);
        }
        return fac;
    }

}
