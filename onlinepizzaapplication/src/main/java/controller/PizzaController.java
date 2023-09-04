package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import entity.Pizza;
import exception.PizzaNotAddedException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.PizzaStoreService;
import service.PizzaStoreServiceImpl;


public class PizzaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PizzaStoreService p;
   protected void doGet(HttpServletRequest request,
		   HttpServletResponse response) 
		   throws ServletException, IOException {
	   	int k = Integer.parseInt(request.getParameter("pizzaid"));
	   	String n=request.getParameter("pizzaname");
	   	int cost=Integer.parseInt(request.getParameter("pizzacost"));
	   	String d=request.getParameter("pizzadate");
	   	DateTimeFormatter ddf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	   	p=new PizzaStoreServiceImpl();
	   	Pizza pizza=new Pizza(k,n,cost,LocalDate.parse(d, ddf));
	   	try {
			p.addPizza(pizza);
		} catch (PizzaNotAddedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	
//	   	for (Pizza pi :p.getAllPizza()) {
//	   		response.getWriter()
//			.append(pi.toString());
//		/}
		
		
		
	}

	
	
}
