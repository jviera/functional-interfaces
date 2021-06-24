package com.vieracode;

import com.vieracode.domain.Book;
import com.vieracode.enums.NationalityEnum;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    //Predicate examples
    public static void main(String args[])
    {
        BookService service = new BookServiceImpl();
        List<Book> books = service.findAll();
        //Predicates
        Predicate<Book> bookPredicate = (b) -> b.getAuthor().getNationality().equals(NationalityEnum.AMERICAN);
        Predicate<Book> bookPredicate2 = bookPredicate.and(b -> !b.getAuthor().getName().contains("Stephen"));
        books.stream().filter(bookPredicate2).forEach(System.out::println);
    }
}
