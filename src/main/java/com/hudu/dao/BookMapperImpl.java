package com.hudu.dao;

import com.hudu.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper {

//    SqlSessionTemplate sqlSessionTemplate;

    public void addBook(Books books) {

    }

    public void deleteBookById(int id) {

    }

    public void updateBook(Books books) {

    }

    public Books queryBookById(int id) {
        return null;
    }

    public List<Books> queryAllBook() {
        return null;
    }

    public List<Books> queryBookByName(String bookName) {
        return null;
    }
}
