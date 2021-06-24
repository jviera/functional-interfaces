package com.vieracode.service;

import com.vieracode.domain.Author;
import com.vieracode.domain.Book;
import com.vieracode.enums.NationalityEnum;

import java.util.ArrayList;
import java.util.List;

public interface BookService {


    public List<Book> findAll();
}
