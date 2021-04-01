package com.example

import com.example.domain.Book;
import io.reactivex.Flowable;
import io.micronaut.retry.annotation.Fallback;

@Fallback
class Service2Fallback implements Service2{
    @Override
    Flowable<ArrayList<Book>> findBooks(){
        Book book = new Book(title: "Default", author: "default", isbn: "default");

        Flowable.just([book]);
    }
}
