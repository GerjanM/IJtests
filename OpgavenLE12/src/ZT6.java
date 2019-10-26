import java.awt.*;

public class ZT6 {
    public static Point[] rits(int[] rijLinks, int[] rijRechts) {
        int lengte = rijLinks.length;
        Point[] ritsRij = new Point[lengte];
        for (int i = 0; i < lengte; i++) {
            int x = rijLinks[i];
            int y = rijRechts[i];
            Point p = new Point(x, y);
            ritsRij[i] = p;
        }
        return ritsRij;
    }
}
