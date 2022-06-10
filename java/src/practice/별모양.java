package practice;

public class 별모양 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j=4-i; j<5; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}