package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ChildDetails;
import com.example.demo.service.ChildService;


@RestController
public class Controllers {
	@Autowired
	private ChildService serve;
	@PostMapping("/add")
	public ChildDetails postSong(@RequestBody ChildDetails song)
	{
		return serve.addChild(song);
	}
	
	@GetMapping("/show")
	public List<ChildDetails> showChild()
	{
		
		List<ChildDetails> a = new ArrayList<>();
		a = serve.getChild();
		return a;
	
	}
	
	@GetMapping("/showsortview")
    public List<ChildDetails> getSortedDetails()
    {
    	return serve.sort();
    }
	

	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		try {
	        serve.deleteChildById(id);
} catch (Exception e) {
	        System.out.println("Failed delete operation");
	    }
	}
	@PutMapping("/update/{id}")
      public  ChildDetails  update(@PathVariable int id,@RequestBody ChildDetails s) {
		try {
	        ChildDetails updatedSong = serve.update(id, s);
	        System.out.println("Successful update operation");
	        return  serve.update(id, s);
	    } catch (Exception e) {
	        System.out.println("Failed update operation");
	        return serve.update(id, s);
	    }
      }
	
}

