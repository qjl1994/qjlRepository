package com.example.dao.impl;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookDao;
import com.example.mapper.BookMapper;

@Service
public class BookDaoImpl implements BookDao {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.selectAll();
	}

	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		bookMapper.insert(book);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		bookMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookMapper.updateByPrimaryKey(book);
	}

	@Override
	public List<Book> fetchByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return bookMapper.fetchByCategoryId(categoryId);
	}
	
}
