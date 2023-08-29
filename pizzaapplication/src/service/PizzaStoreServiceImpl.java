package service;

import java.util.List;

import dao.PizzaStoreDao;
import dao.PizzaStoreDaoImpl;
import entity.Pizza;
import exception.PizzaIdNotFoundException;
import exception.PizzaNotAddedException;

public class PizzaStoreServiceImpl implements PizzaStoreService{
	PizzaStoreDao pizzaDao;
		
	public PizzaStoreServiceImpl(PizzaStoreDao pizzaDao) {

		this.pizzaDao = pizzaDao;
	}

	@Override
	public void addPizza(Pizza pizza) throws PizzaNotAddedException {
		// pizza object is going to come from view layer
		// if i wanted to perform any business logic 
		// pass the pizza to dao impl layer
		
		pizzaDao.addPizza(pizza);
		
		
	}

	@Override
	public Pizza getPizzaById(int pizzaId) throws PizzaIdNotFoundException {
		
		Pizza p1=pizzaDao.getPizzaById(pizzaId);
		if(p1==null) {
			throw new PizzaIdNotFoundException("Pizza Id is not found check the pizza Id !!! ");
		}
		return p1;
	}

	@Override
	public List<Pizza> getAllPizza() {
		
		List<Pizza> list1=pizzaDao.getAllPizza();
		return list1;
	}

	@Override
	public int deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

}
