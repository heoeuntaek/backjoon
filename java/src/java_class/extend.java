package java_class;

class A2 {
    private int x;
    private int y;

    public void print(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    public A2(){
        System.out.println("생성자A");
    }
    public A2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class B2 extends A2 {
    public B2(){

        System.out.println("생성자B");
    }

    public B2(int a, int b){
        super(a,b);
        System.out.println("매개 생성자 B");
    }
}

public class extend {
    public static void main(String[] args) {
        System.out.println("A를 생성");
        B2 b ;
        b = new B2(5,5);

        b.print();
        String a = "안녕";
        if(a instanceof String)
        {System.out.println("투루");}

        System.out.println(a instanceof String);

    }
}