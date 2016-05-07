package org.controller;


import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/*
import DAO.UserManager;
import Model.User;
import ProductDAOImpl;*/


import DAOClass.UserManager;

import ModelClass.User;

@Controller
public class Hello {

	  private ProductDAOImpl service;
	  
	/*  @Autowired
	  @Qualifier(value="personService")
	   UserManager userservice;
	    */
	  @Autowired
	UserManager userservice;

	public UserManager getUserservice() {
		return userservice;
	}
	public void setUserservice(UserManager userservice) {
		this.userservice = userservice;
	}
	public ProductDAOImpl getService() {
		
		return service;
	}
	public void setService(ProductDAOImpl service) {
		this.service = service;
	}
	@RequestMapping("/")	   
	   public String showMessage()
	   {
		System.out.println("Welcomeeeeeeeeeeeeee");
		System.out.println("Before****");
		User u=new User();
		  u.setUsername("Punam");
		  u.setPassword("Punam");
		
		  this.userservice.addRec(u);
		  System.out.println("After");
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
	   
	   public String info(@RequestParam("name")String name,Map <String,ArrayList>model) 
	   {
		   System.out.println("###"+name);
		  ArrayList pd=new ProductDAOImpl().findProduct(name);  
		  System.out.println(pd);
		  model.put("data",pd);
		  ModelAndView mv=new ModelAndView("Info");
		  mv.addObject(pd);
		   return "Info";
	   }
	   
	   
	  /* @RequestMapping("/Info")
	   public String Info()
	   {
		   return "info";
	   }*/
	   @RequestMapping("/view")
	   public String view()
	   {
		   return "view";
	   }
	   
       @RequestMapping("/ViewAll")
       public String geData(Map <String,ArrayList>model) 
       {
    	   
    	 //  JSONObject ob=WriteData.write(); 
    	 
 		  ArrayList pd=new ProductDAOImpl().getData();  
 		  System.out.println("Viewwwwwwwww"+pd);
 		  model.put("data",pd);
 		  ModelAndView mv=new ModelAndView("ViewAll");
 		  mv.addObject(pd);
    	   return "ViewAll";
       }
       
       
       
      /* @RequestMapping("/getData1")
       @ResponseBody
       public String geData1()
       {
    	   String data=new ProductDAOImpl().getData();
    	 //  System.out.println("in getdATA"+ WriteData.write());
    	 return data;
       }*/
       
       
       
       
       
	   
}
