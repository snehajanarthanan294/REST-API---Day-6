package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ChildDetails")
public class ChildDetails {
	@Id
    @Column(name="Id")
    private int id;
    
    @Column(name="ChildName")
    private String childname;
    
    @Column(name="MotherName")
    private String mothername;
    
    @Column(name="FatherName")
    private String fathername;
    
    @Column(name="Address")
    private String address;
    
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id=id;
    }
    public String getChildName() {
        return childname;
    }

    public void setChildName(String childname) {
        this.childname = childname;
    }
    public String getMotherName()
    {
    	return mothername;
    }
    public void setMotherName(String mothername)
    {
    	this.mothername=mothername;
    }
    public String getFatherName() 
    {
    	return fathername;
    }
    
    public void setFatherName(String fathername) 
    {
    	this.fathername=fathername;
    }
    
    public String getAddress()
    {
    	return address;
    }
    public void setAddress(String address)
    {
    	this.address=address;
    }
    public ChildDetails() {}
    public ChildDetails(int id, String childname, String mothername,String fathername,String address) {
		super();
		this.id = id;
		this.childname = childname;
		this.mothername = mothername;
		this.fathername=fathername;
		this.address = address;
	}
}