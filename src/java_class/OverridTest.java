package java_class;

class Mypoint3{
    int x;
    int y;
    public String toString(){
        return "x="+x+", y="+y;
    }
    Mypoint3(int x, int y){
        this.x= x;
        this.y=y;
    }
}


public class OverridTest {
    public static void main(String[] args) {
        Mypoint3 p = new Mypoint3(3,5);
//        p.x=3;
//        p.y=2;
//        p.z=1;
        System.out.println(p);

    }
}