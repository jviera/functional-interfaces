package com.vieracode;

import com.vieracode.domain.Author;
import com.vieracode.domain.Book;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BiConsumerMain {
    //BiConsumer examples
    public static void main(String args[])
    {
        BookService service = new BookServiceImpl();
        List<Book> books = service.findAll();

        Map<Integer, Author> map = books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getAuthor));
        map.forEach(BiConsumerMain::print);
    }

    public static void print(Integer isbn, Author author) {
        System.out.println(isbn+" "+author.getName());
    }
}
