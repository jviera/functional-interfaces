package com.vieracode;

import com.vieracode.domain.Book;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.OptionalInt;

public class BasicStreamMain {

    public static void main(String args[]) {
        BookService service = new BookServiceImpl();
        List<Book> books = service.findAll();

        OptionalInt optionalInt = books.stream().mapToInt(Book::getPagesNumber).reduce(Integer::sum);
        if(optionalInt.isPresent()){
            System.out.println(optionalInt.getAsInt());
        }

    }
}
