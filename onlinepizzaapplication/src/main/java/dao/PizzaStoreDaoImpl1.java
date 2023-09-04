package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Pizza;

public class PizzaStoreDaoImpl1 implements PizzaStoreDao {
	public static List<Pizza> pizzaList;
	static {
		pizzaList=new ArrayList<Pizza>();
	}

	@Override
	public int addPizza(Pizza pizza) {
		pizzaList.add(pizza);
		return 1;
	}

	@Override
	public Pizza getPizzaById(int pizzaId) {
		for (Pizza pizza : pizzaList) {
			if(pizza.getPizzaId()==pizzaId) {
				return pizza;
			}
		}
		return null;
	}

	@Override
	public List<Pizza> getAllPizza() {
		
		return pizzaList;
	}

	@Override
	public int deletePizza(Pizza pizza) {
		for (Pizza pizza1 : pizzaList) {
			if(pizza1.getPizzaId()==pizza.getPizzaId()) {
				pizzaList.remove(pizza1);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

}
