package org.book;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    ArrayList<Book> books = new ArrayList<>();
    Map<String,String> bookAndAuthor = new HashMap<>();

    public void addBooks() {
        books.add(new Book(1,"Kitap 1",345,"Yazar 1",new Date()));
        books.add(new Book(2,"Kitap 2",475,"Yazar 2",new Date()));
        books.add(new Book(3,"Kitap 3",84,"Yazar 3",new Date()));
        books.add(new Book(4,"Kitap 4",114,"Yazar 4",new Date()));
        books.add(new Book(5,"Kitap 5",652,"Yazar 5",new Date()));
        books.add(new Book(6,"Kitap 6",145,"Yazar 6",new Date()));
        books.add(new Book(7,"Kitap 7",56,"Yazar 7",new Date()));
        books.add(new Book(8,"Kitap 8",96,"Yazar 8",new Date()));
        books.add(new Book(9,"Kitap 9",340,"Yazar 9",new Date()));
        books.add(new Book(10,"Kitap 10",277,"Yazar 10",new Date()));
    }


    public List<Book> numberOfPagesGreaterThanHundred() {
        List<Book> filtered = this.books.stream().filter(book->book.getNumberOfPage() > 400).toList();

        return filtered;
    }


    public void showBooks() {
        this.books.stream().forEach(book -> {
            bookAndAuthor.put(book.getBookName(),book.getAuthorName());
        });


        bookAndAuthor.forEach((key,value) -> {
            System.out.println(key + " : " + value);
        });

    }

    public static void main(String[] args) {
        Main main = new Main();

        main.addBooks();
//        main.showBooks();

        for (Book book:main.numberOfPagesGreaterThanHundred()) {
            System.out.println(book.getBookName() + " => " + book.getNumberOfPage());
        }

    }
}