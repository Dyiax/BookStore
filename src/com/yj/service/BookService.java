package com.yj.service;
//这是一个图书服务接口 BookService，定义了一系列关于图书管理的方法，包括增加图书、更新图书、删除图书、查询图书等。
import com.yj.bean.Book;
import com.yj.bean.Page;

import java.math.BigDecimal;
import java.util.List;


public interface BookService {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void deleteBookById(Integer id);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    Page<Book> page(int pageNo, int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);

    Page<Book> pageByNameOrAuthor(int pageNo, int pageSize, String nameOrAuthor);

    Page<Book> pageOrder();

    public Integer queryTotalBooks();

    BigDecimal queryTotalMoney();
}
