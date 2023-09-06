package 연습;

public class thread {
    public static void main(String[] args) {
        System.out.println("1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep((1000));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3");
            }
        }).start();

        System.out.println("2");
    }
}
