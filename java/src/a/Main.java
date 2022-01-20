package a;

public class Main {
    public static void main(String[] args) {
        //User user = new User("이홍철", 27, "게임");
        User user= new User();
        user.setName("안녕");
        //System.out.println(user.name);
        System.out.println(user.getName());
        System.out.println(user.age);
        System.out.println(user.hobby);


    }


}
