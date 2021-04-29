package com.example.listviewstudy;

public class MovieData {
    private int poster; //포스터 이미지가 있는 리소스 아이디값 담는 변수
    private String movieName;
    private String category;
    private String release;
    private String character;

    //생성자 -> 데이터 값 세팅
    public MovieData(int poster,String movieName, String category, String release, String character){
        this.poster = poster;
        this.movieName = movieName;
        this.category = category;
        this.release = release;
        this.character = character;
    }
    //getter 함수 구현
    public int getPoster() {
        return poster;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCategory() {
        return category;
    }

    public String getRelease() {
        return release;
    }

    public String getCharacter() {
        return character;
    }
}
