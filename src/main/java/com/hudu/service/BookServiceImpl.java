package com.hudu.service;

import com.hudu.dao.BookMapper;
import com.hudu.pojo.Books;

import java.util.List;

//@Service
public class BookServiceImpl implements BookService{

    //service层调用dao层，组合Dao层
    private BookMapper bookMapper;

//    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void addBook(Books books) {
        bookMapper.addBook(books);
    }

    public void deleteBookById(int id) {
        bookMapper.deleteBookById(id);
    }

    public void updateBook(Books books) {
        bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
