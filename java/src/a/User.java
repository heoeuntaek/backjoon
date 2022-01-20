package a;

public class User {
    String name;
    int age;
    String hobby;

//    public User (String _name, int _age, String _hobby){
//        this.name=_name;
//        this.age=_age;
//        this.hobby=_hobby;

     public  User() { } //- 생성자가 없을 때 자동으로 만들어짐
    public User(String name, int age, String hobby) {  //생성자
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
