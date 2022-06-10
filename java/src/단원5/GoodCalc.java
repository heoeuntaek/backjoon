package 단원5;

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        sum = sum / a.length;
        return sum;
    }


    public static void main(String[] args) {
        GoodCalc a = new GoodCalc();
        System.out.println(a.add(2, 3));
        System.out.println(a.subtract(3, 1));
        System.out.println(a.average(new int[]{2,3,4}));

    }
}