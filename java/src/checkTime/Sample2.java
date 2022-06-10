package checkTime;

public class Sample2 {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public Sample2(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Sample2 a = new Sample2(3);
        int n = a.getX();
    }
}