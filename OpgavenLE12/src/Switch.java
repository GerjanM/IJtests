public class Switch {
    public int Opgave8(int a) {
        int x = 5;
        switch (a) {
            case 1:
                x += 5;
                break;
            case 2:
                x += 10;
                break;
            case 3:
            case 4:
                x += 16;
                break;
            case 5:
                x += 100;
                break;
            default:
                x += 1000;
        }
        return x;
    }
}
