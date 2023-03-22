package 단원5;

class SuperObject {
    public void paint(){
        draw();
    }

    public void draw() {
        draw();
        System.out.println("Super object");

    }
}

class SubObject extends SuperObject {

    public void paint(){
        super.draw();
    }

    public void draw(){
        System.out.println("sub object");
    }
}

public class Sample {
    public static void main(String[] args) {
        SuperObject b = new SubObject(); // 업캐스팅 (자윤스러움)
        b.paint();
    }
}