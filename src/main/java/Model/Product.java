package Model;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.*;
import com.google.gson.annotations.JsonAdapter;
 
@XmlRootElement

public class Product {
	
	private String name;
	private String quantity;
	private String price;
	public Product(String name,String quantity,String price)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
