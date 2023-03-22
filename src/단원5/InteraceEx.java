package 단원5;

interface PhoneInterface {
    final int TIMEOUT = 10000; // 상수
    void sendcall();
    void receiveCall();
    default void printLog() {
        System.out.println("** phone **");

    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x, int y) {
        return x+y;
    }
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

    @Override
    public void sendcall() {
        System.out.println("따르릉따르릉");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔어요");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자갑니다");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요");
    }

    @Override
    public void play() {
        System.out.println("음악연주");
    }

    @Override
    public void stop() {
        System.out.println("음악중지");
    }

    public void schedule() {
        System.out.println("일정관리");
    }

}

public class InteraceEx{
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLog();
        phone.sendcall();
        phone.receiveCall();
        phone.play();
        phone.stop();
        System.out.println("3과 5를 더하면" +
                phone.calculate(3, 5));
        phone.schedule();
    }
}