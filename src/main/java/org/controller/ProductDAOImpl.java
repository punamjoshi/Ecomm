package org.controller;





import java.util.ArrayList;





import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;




import DAOClass.ProductDAO;
import ModelClass.Product;

@Service
public  class  ProductDAOImpl implements ProductDAO {

	private ArrayList< Product> products=new ArrayList<Product>();
	
	public ProductDAOImpl()
	{
		Product p;
		
		
		
		p=new Product("Galaxy","23","12000","Mobile","Samsung");
		products.add(p);
		p=new Product("Ring","2","23000","Jwellery","PNG");
		products.add(p);
		
		
	
	}
	 public ArrayList getData() 
	{
		/*Product p;
	
		//ArrayList< Product> al=new ArrayList<Product>();
								
		Gson gson = new GsonBuilder().create();
	    // .setPrettyPrinting()
	            

	    String arrayListToJson = gson.toJson(products);
		return arrayListToJson;*/
		 
		 return products;
	}
	 
	 public ArrayList findProduct(String name)
	 {
		 
		 ArrayList<Product> Res=new ArrayList<Product>();
		 for(Product p :products)
		 {
			 if(p.getCtg().equals(name))
			 {
				 Res.add(p);
				 break;
			 }
		 }
		 Gson gson = new GsonBuilder().create();
		    // .setPrettyPrinting()
		            

		    String arrayListToJson = gson.toJson(Res);
			return Res;
		//    return arrayListToJson;
		
	 }
	
}

