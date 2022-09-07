package com.bridgelabz.bookstore;

public class Books {

    private String bookName;
    private String author;
    private String releaseDate;
    private String genre;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
