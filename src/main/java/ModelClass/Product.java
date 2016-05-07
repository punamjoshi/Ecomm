package ModelClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
	@GeneratedValue
	private String product_id;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	@Column
	private String name;
	@Column
	private String quantity;
	@Column
	private String price;
	@Column
	private String ctg;
	@Column
	private String subctg;
	public String getCtg() {
		return ctg;
	}
	public void setCtg(String ctg) {
		this.ctg = ctg;
	}
	public String getSubctg() {
		return subctg;
	}
	public void setSubctg(String subctg) {
		this.subctg = subctg;
	}
	
	public Product(){}
	public Product(String name,String quantity,String price,String ctg,String subctg)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.ctg=ctg;
		this.subctg=subctg;
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
