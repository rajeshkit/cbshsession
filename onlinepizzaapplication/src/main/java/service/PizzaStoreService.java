package service;

import java.util.List;

import entity.Pizza;
import exception.PizzaIdNotFoundException;
import exception.PizzaNotAddedException;

public interface PizzaStoreService {
	public void addPizza(Pizza pizza) throws PizzaNotAddedException;
	public Pizza getPizzaById(int pizzaId) throws PizzaIdNotFoundException;
	public List<Pizza> getAllPizza();
	public int deletePizza(Pizza pizza);
	public Pizza updatePizza(Pizza pizza);
}
