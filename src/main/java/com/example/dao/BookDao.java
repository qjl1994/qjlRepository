package com.example.dao;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {
	public List<Book> findAll();
	public void add(Book book);
	public void delete(int id);
	public void update(Book book);
	public List<Book> fetchByCategory(int categoryId);
}
