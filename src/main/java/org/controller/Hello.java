package org.controller;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;







import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Hello {

	   @RequestMapping("/")	   
	   public String showMessage()
	   {
		   System.out.println("Controller***************");
		   return "index";
	   }
	   @RequestMapping("/Login")
	   public String login()
	   {
		   return "Login";
	   }
	   
	   @RequestMapping("/Registration")
	   public String register()
	   {
		   return "Registration";
	   }
	   
	   @RequestMapping("/Aboutus")
	   public String about()
	   {
		   return "Aboutus";
	   }
	   
	   @RequestMapping("/Info")
	   public String info() 
	   {
		  // ProductDAOImpl.write();   
		   return "Info";
	   }
	   
	   @RequestMapping("/view")
	   public String view()
	   {
		   return "view";
	   }
	   
       @RequestMapping("/ViewAll")
       public String geData() 
       {
    	 //  JSONObject ob=WriteData.write(); 
    	   return "ViewAll";
       }
       
       
       
       @RequestMapping("/getData1")
       @ResponseBody
       public String geData1()
       {
    	   String data=new ProductDAOImpl().getData();
    	 //  System.out.println("in getdATA"+ WriteData.write());
    	 return data;
       }
       
       
       
       
       
	   
}
