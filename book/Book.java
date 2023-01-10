package org.book;

import java.util.Date;

public class Book {

    private int id;
    private String bookName;
    private int numberOfPage;
    private String authorName;
    private Date releaseDate;

    public Book(int id, String bookName, int numberOfPage, String authorName, Date releaseDate) {
        this.id = id;
        this.bookName = bookName;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
