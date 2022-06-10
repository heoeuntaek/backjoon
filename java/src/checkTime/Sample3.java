package checkTime;

public class Sample3 {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public Sample3(int x) {
        this.x = x;
    }

    public Sample3(){}; // 기본생성자



    public static void main(String[] args) {
        Sample3 a = new Sample3();  //기본생성자가 없어서
        int n = a.getX();
    }
}