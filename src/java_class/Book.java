package java_class;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");

    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린 왕자", "샏텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        System.out.println("littlePrince = " + littlePrince.title + "  " + littlePrince.author);
        loveStory.show();

    }
}