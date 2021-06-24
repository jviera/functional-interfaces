package com.vieracode.service.impl;

import com.vieracode.domain.Author;
import com.vieracode.domain.Book;
import com.vieracode.enums.NationalityEnum;
import com.vieracode.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    static List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book(12345, "I, Robot", new Author("Isaac Asimov", NationalityEnum.RUSSIAN), 250));
        books.add(new Book(67890, "Harry Potter", new Author("J. K. Rowling", NationalityEnum.BRITISH), 400));
        books.add(new Book(13579, "It", new Author("Stephen King", NationalityEnum.AMERICAN), 1200));
        books.add(new Book(24680, "Misery", new Author("Stephen King", NationalityEnum.AMERICAN), 300));
        books.add(new Book(14701, "A Game of Thrones", new Author("George R. R. Martin", NationalityEnum.AMERICAN), 450));
    }

    @Override
    public List<Book> findAll() {
        return books;
    }
}
