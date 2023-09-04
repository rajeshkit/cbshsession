package dao;

import java.util.List;

import entity.Pizza;

public interface PizzaStoreDao {
	public int addPizza(Pizza pizza);
	public Pizza getPizzaById(int pizzaId);
	public List<Pizza> getAllPizza();
	public int deletePizza(Pizza pizza);
	public Pizza updatePizza(Pizza pizza);
}
