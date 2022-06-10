package 과제;

import java.util.Scanner;

public class Song {
    private String title; // 노래제목
    private String artist; // 가수
    private String year; // 발표년도
    private String country; // 국적

    public Song(String year, String country, String artist, String title ) { // 매개변수 있는 생성자
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public Song() { // 매개변수 없는 생성자
        this.title = "거리에서";
        this.artist = "성시경";
        this.year = "2006";
        this.country = "한국";
    }

    public void show() { // 출력
        System.out.print("Song 정보 : ");
        System.out.print(this.year + "년, ");
        System.out.print(this.country + " 국적의 ");
        System.out.print(this.artist + "(이)가 부른 ");
        System.out.println("\"" + this.title + "\"");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("노래제목 가수 발표년도 국적 순서로 입력해주세요.");
        String title= sc.nextLine();
        String artist= sc.nextLine();
        String year= sc.nextLine();
        String country= sc.nextLine();



        Song b = new Song(year, country, artist, title); // 매개변수 있는 생성자
        b.show(); // 출력

        Song a = new Song(); // 매개변수 없는 객체 생성
        a.show(); // 출력


    }
}