package java_class;

public class ArrayParameterEx {
    public static void main(String args[]){
        char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','i','.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }

    static void replaceSpace(char a[]) {  //전역함수
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') a[i] = ',';
        }}
        static void printCharArray(char a[]){
            for (int i=0;i<a.length;i++){
                System.out.print(a[i]);}
                System.out.println();

            }

        }