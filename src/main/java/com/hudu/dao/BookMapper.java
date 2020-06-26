package com.hudu.dao;

import com.hudu.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    void addBook(Books books);

    //删除一本书
    void deleteBookById(@Param("bookID") int id);

    //更新一本书
    void updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookID") int id);

    //查询全部书
    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);
}
