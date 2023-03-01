package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ChildDetails;
import com.example.demo.repository.ChildPaging;
import com.example.demo.repository.ChildRepo;


@Service

public class ChildService{

	@Autowired
	private ChildRepo repo;
	@Autowired
	private ChildPaging r;
	
	public ChildDetails addChild(ChildDetails obj)
	{
		return repo.save(obj);
	}
	
	public List<ChildDetails>getChild()
	{
		Pageable p = PageRequest.of(0, 2);
		Page<ChildDetails> s = r.findAll(p);
		return s.toList();
	}
	public void deleteChildById(int id)
    {
   	 repo.deleteById(id);
    }
    
  public  ChildDetails update(int id,ChildDetails s) 
  {
	   return repo.saveAndFlush(s);
  }
  
  public List<ChildDetails> sort(){
		List<ChildDetails>list=repo.findAll(Sort.by(Sort.Direction.ASC,"childname"));
		return list;
	}
  
  
	
	
}