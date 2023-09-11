package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//back10828
public class Main {

//    push X: 정수 X를 스택에 넣는 연산이다.

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        Main b = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    int a = Integer.parseInt(st.nextToken());
//                    System.out.println("push");
                    b.push(a);
                    break;
                case "pop":
//                    System.out.println("pop");
                    b.pop();
                    break;
                case "size":
//                    System.out.println("size");
                    b.size();
                    break;
                case "empty":
//                    System.out.println("empty");
                    if(b.empty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    };
                    break;
                case "top":
//                    System.out.println("top");
                    if (b.empty()) {
                        System.out.println(-1);
                    } else {
                        b.top();
                    }
                    break;
//        }
            }
        }

    }
//     pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    public void push(int number) {

        arrayList.add(number);
//        System.out.println("arrayList size"+arrayList.size());
    }
//    size: 스택에 들어있는 정수의 개수를 출력한다.

    public void pop() {
        if (arrayList.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(arrayList.get(arrayList.size() - 1));
            arrayList.remove(arrayList.size() - 1);
        }
    }
//   empty: 스택이 비어있으면 1, 아니면 0을 출력한다.

    public void size() {
        int size = arrayList.size();
        System.out.println(size);
    }
//    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    public boolean empty() {
        if (arrayList.size() == 0) {
            return true;
        } else
            return false;

    }

    public void top() {
        if (arrayList.size() != 0) {
            System.out.println(arrayList.get(arrayList.size() - 1));
        }

    }
}



