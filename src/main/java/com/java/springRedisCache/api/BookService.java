package com.java.springRedisCache.api;

import com.java.springRedisCache.dto.Book;

public interface BookService {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}