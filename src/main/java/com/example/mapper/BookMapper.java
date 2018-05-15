package com.example.mapper;

import java.awt.print.Book;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.utils.MyMapper;

@Mapper
public interface BookMapper extends MyMapper<Book> {
	public List<Book> fetchByCategoryId(int categoryId);
}
