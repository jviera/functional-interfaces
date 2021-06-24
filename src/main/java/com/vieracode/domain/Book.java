package com.vieracode.domain;

import java.util.Objects;

/**
 * Book domain
 */
public class Book implements PagesInterface<Book> {
    private int isbn;
    private String title;
    private Author author;
    private int pagesNumber;

    public Book() {
    }

    public Book(int isbn, String title, Author author, int pagesNumber) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", pagesNumber=" + pagesNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
