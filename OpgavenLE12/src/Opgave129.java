import java.util.ArrayList;

public class Opgave129 {
    public ArrayList<Integer> alleenPositief(ArrayList<Integer> rekeningLijst) {
        ArrayList<Integer> rekeningLijst2 = new ArrayList<>();
        for (Integer r : rekeningLijst) {
            if (r >= 0) {
                rekeningLijst2.add(r);
            }
        }
        rekeningLijst = rekeningLijst2;
        return rekeningLijst;
    }
}
