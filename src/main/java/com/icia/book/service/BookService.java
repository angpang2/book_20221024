package com.icia.book.service;

import com.icia.book.DTO.BookDTO;
import com.icia.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public boolean save(BookDTO bookDTO) {
        int result = bookRepository.dbSave(bookDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }






}