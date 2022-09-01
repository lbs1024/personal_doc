package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;

/**
 * @author lbs
 * @description 快速springmvc
 */
public class SimpleBootController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    private Book findBookById(int id) {
        System.out.println("id" + id);
        return new Book();
    }
}
