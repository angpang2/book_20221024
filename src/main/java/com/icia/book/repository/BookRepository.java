package com.icia.book.repository;

import com.icia.book.DTO.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;


    public int dbSave(BookDTO bookDTO) {
        return sql.insert("Book.dbSave",bookDTO);
    }
}
