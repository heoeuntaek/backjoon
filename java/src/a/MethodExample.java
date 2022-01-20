package a;

public class MethodExample {
    public static void main(String[] args) {

        String a="홍";
        String b="나";
        MethodExample methodExample =new MethodExample();
        System.out.printf(methodExample.Strcombine("홍드","로이드"));

    }


//    public void Strcombine(String a, String b){
//        String result= a+b;
//        System.out.println(result);
//    }
    public String Strcombine(String a, String b){
        String result=a+b;
        return result;
    }


}
