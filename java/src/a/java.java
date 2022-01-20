package a;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int i = sc.nextInt();
//        while(i<10) {
//            System.out.println(i);
//            i++;
//        }
        int arrayInt[]=new int[10];
        for (int i=0; i<arrayInt.length;i++){
            System.out.println(i);

        }
        System.out.printf("\n");
        int arrayInt2[]={1,3,5,7,9};
        for (int i=0; i<arrayInt2.length;i++){
            System.out.println(i);

        }
        System.out.printf("\n");
        int arrayInt3[]={1,3,5,7,9};
        for (int i=0; i<arrayInt2.length;i++){
            System.out.println(arrayInt3[i]);
        }
        int intArray[]=new int[5];
        try{   //try 안을 실행했을 때 에러 발생하면 catch로 감.
            intArray[3]=10;
            intArray[6]=1;
        }
        catch (Exception e){
            e.printStackTrace(); //실제 에러문 출력
            System.out.printf("프로그램이 끝났어요.\n");
            System.exit(0); //강제 프로그램 종로
        }
    }
}
