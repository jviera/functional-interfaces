package com.vieracode;

import com.vieracode.domain.Author;
import com.vieracode.domain.Book;
import com.vieracode.enums.NationalityEnum;
import com.vieracode.service.BookService;
import com.vieracode.service.impl.BookServiceImpl;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    /**
     * consumer examples
     * @param args
     */
    public static void main(String args[]) {
        BookService service = new BookServiceImpl();
        List<Book> books = service.findAll();
        //Many forms to create a consumer
        //Consumer<Book> consumer = (b) -> System.out.println(b.getAuthor().getName());
        //Consumer<Book> consumer =  Main::consumerName;
        Consumer<Book> consumerName =  (b) -> consumerName(b);
        Consumer<Book> consumerNationality =  (b) -> consumerNationality(b);
        Consumer<Book> consumerCombinate = consumerName.andThen(consumerNationality);

        consumerCombinate.accept(new Book(54321, "La casa de los espiritus", new Author("Isabel Allende", NationalityEnum.CHILEAN), 180));

        //books.stream().forEach(consumer);
    }

    public static void consumerName(Book book) {
        System.out.println(book.getAuthor().getName());
    }

    public static void consumerNationality(Book book) {
        System.out.println(book.getAuthor().getNationality());
    }
}
