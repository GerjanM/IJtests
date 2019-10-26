package OpgavenLE12Package;

public class Zin {
    private String deZin = "";

    //constructor 2
    public Zin(String[] woorden) {
        int lengte = woorden.length;
        for (int i = 0; i < lengte; i++) {
            deZin = deZin + woorden[i];
        }
    }

    public Zin(String s){
        deZin=s;
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

    public String[] splits() {
        String woorden[] = null;
        if (deZin.equals("")||deZin==null){
            return woorden;
        }
        else {
            int aantalSpaties=telAantalKeer(' ');
            int aantalWoorden=aantalSpaties+1;
            woorden = new String[aantalWoorden];
            int beginIndex = 0;
            for(int i=0;i<aantalSpaties;i++){
                //int beginIndex = 0;
                int endIndex = deZin.indexOf(" ",beginIndex);
                woorden[i]=deZin.substring(beginIndex,endIndex);
                beginIndex=endIndex+1;
            }
            woorden[aantalSpaties]=deZin.substring(beginIndex);
            return woorden;
        }
    }
}