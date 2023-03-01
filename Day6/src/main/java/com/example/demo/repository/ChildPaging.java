package com.example.demo.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Entity.*;

public interface ChildPaging extends PagingAndSortingRepository<ChildDetails,Integer>{
	
	

}
