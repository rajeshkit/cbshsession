package view;

import dao.PizzaStoreDao;
import dao.PizzaStoreDaoImpl;
import dao.PizzaStoreDaoImpl1;

public class PizzaStoreFactory {
	public static PizzaStoreDao dao=null;
	public static PizzaStoreDao getDaoImplType(String type) {
		if(type.equalsIgnoreCase("jdbc")) {
			dao=new PizzaStoreDaoImpl();
		}
		if(type.equalsIgnoreCase("collection")) {
			dao=new PizzaStoreDaoImpl1();
		}
		return dao;
	}
}
