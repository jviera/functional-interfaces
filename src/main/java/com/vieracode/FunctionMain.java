package com.vieracode;

import com.vieracode.domain.Author;
import com.vieracode.domain.Book;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    //Function example
    public static void main(String args[])
    {
        BookService service = new BookServiceImpl();
        List<Book> books = service.findAll();
        Function<Book, Author> function = (b) -> b.getAuthor();
        books.stream().map(function).forEach(System.out::println);
    }
}
