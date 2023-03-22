package java_class;

class Time{
    private int hour;
    private int b;
    public int getHours(){
        return hour;
    }
    public void setHours(int hour){
        this.hour=hour;
    }
}

public class a {
    public static void main(String[] args) {
        Time b = new Time();
        b.setHours(5);
        System.out.println(b.getHours());


    }
}