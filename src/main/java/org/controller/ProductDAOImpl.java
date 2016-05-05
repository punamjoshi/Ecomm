package org.controller;





import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DAO.ProductDAO;
import Model.Product;

public  class  ProductDAOImpl implements ProductDAO {

	 public String getData() 
	{
		Product p;
	
		ArrayList< Product> al=new ArrayList<Product>();
		
		p=new Product("Mobile","23","12000");
		al.add(p);
		p=new Product("Jwellery","2","23000");
		al.add(p);
		
		
	
		Gson gson = new GsonBuilder().create();
	    // .setPrettyPrinting()
	            

	    String arrayListToJson = gson.toJson(al);
		return arrayListToJson;
	}
	
}

