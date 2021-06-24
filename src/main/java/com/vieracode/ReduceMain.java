package com.vieracode;

import com.vieracode.domain.Book;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.Optional;

public class ReduceMain {

    public static void main(String args[]) {
        BookService services = new BookServiceImpl();
        List<Book> books = services.findAll();

        Optional<Book> reduce = books.stream().reduce(Book::getMaxPages);
        if(reduce.isPresent()) {
            System.out.println("ISBN: "+reduce.get().getIsbn());
            System.out.println("Author: "+reduce.get().getAuthor().getName());
            System.out.println("Pages: "+reduce.get().getPagesNumber());
        }
        else {
            System.out.println("It's not present!");
        }
    }
}
