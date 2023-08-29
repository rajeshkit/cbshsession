package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dao.PizzaStoreDao;
import entity.Pizza;
import exception.PizzaIdNotFoundException;
import exception.PizzaNotAddedException;
import service.PizzaStoreService;
import service.PizzaStoreServiceImpl;

public class PizzaMain {
	public static void main(String[] args) {
		String answer=null;
		PizzaStoreService pizzaService=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice of dao implemenation");
		String choice = s.next();
		PizzaStoreDao pdao=PizzaStoreFactory.getDaoImplType(choice);
		do {
			System.out.println("Welcome to pizza store");
			System.out.println("1.Add Pizza");
			System.out.println("2.Find Pizza By Id");
			System.out.println("3.Show All Pizza");
			System.out.println("4.Delete a Pizza");
			System.out.println("5.Update a Pizza");
			System.out.println("Enter your option");
			int option=s.nextInt();
			switch(option) {
			case 1:
				//add pizza
				Pizza p=new Pizza();
				System.out.println("Enter the pizza Id");
				p.setPizzaId(s.nextInt());
				s.nextLine();
				System.out.println("Enter the pizza name");
				p.setPizzaName(s.nextLine());
				System.out.println("Enter the cost");
				p.setCost(s.nextInt());
				System.out.println("Enter the deliver date(dd-MM-yyyy)");
				String stringDate=s.next();
				DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
				p.setDeliveryDate(LocalDate.parse(stringDate, dtf));
				pizzaService=new PizzaStoreServiceImpl(pdao); 
				try {
					pizzaService.addPizza(p);
				} catch (PizzaNotAddedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the pizza id want to find ");
				int pId = s.nextInt();//4000
				pizzaService=new PizzaStoreServiceImpl(pdao); 
				try {
					Pizza p2 = pizzaService.getPizzaById(pId);
					System.out.println(p2);
					
				} catch (PizzaIdNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				//Show All Pizza
				System.out.println("Show all Pizzas");
				pizzaService=new PizzaStoreServiceImpl(pdao); 
				List<Pizza> list2 = pizzaService.getAllPizza();
				for (Pizza pizza : list2) {
					System.out.println(pizza);
				}
				break;
			case 4:
				//Delete a Pizza
				break;
			case 5: 
				//update a pizza
				break;
			}
			s.nextLine();
			System.out.println("Do you want to continue(yes / no)");
			answer=s.nextLine();
		}while(answer.equalsIgnoreCase("yes"));
		
	}
}
