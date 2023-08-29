package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Pizza;

public class PizzaStoreDaoImpl implements PizzaStoreDao {

	@Override
	public int addPizza(Pizza pizza)  {
		// jdbc code insert pizza obj details insert query
		String url="jdbc:mysql://localhost:3306/pizzadb";
		String username="root";
		String password="root@123";
		String insertQuery="INSERT INTO pizza VALUES(?,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con = DriverManager.getConnection(url, username, password);
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, pizza.getPizzaId());
			pstmt.setString(2, pizza.getPizzaName());
			pstmt.setInt(3, pizza.getCost());
			pstmt.setDate(4, Date.valueOf(pizza.getDeliveryDate()));
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pizza);
		
		return 0;
	}

	@Override
	public Pizza getPizzaById(int pizzaId)  {
		// jdbc code get the pizza by id using select sql
		String url="jdbc:mysql://localhost:3306/pizzadb";
		String username="root";
		String password="root@123";
		PreparedStatement pstmt=null;
		Connection con=null;
		Pizza pz=null;
		try {
			con = DriverManager.getConnection(url, username, password);
			pstmt=con.prepareStatement("SELECT * FROM pizza WHERE pizza_id=?");
			pstmt.setInt(1, pizzaId);//4000

			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) { 
				pz=new Pizza();
				pz.setPizzaId(rs.getInt(1));//100
				pz.setPizzaName(rs.getString(2));//chicken
				pz.setCost(rs.getInt(3));//700
				pz.setDeliveryDate(rs.getDate(4).toLocalDate());//2023-08-29
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pz;
	}

	@Override
	public List<Pizza> getAllPizza() {
		String url="jdbc:mysql://localhost:3306/pizzadb";
		String username="root";
		String password="root@123";
		PreparedStatement pstmt=null;
		Connection con=null;
		List<Pizza> list=null;
		Pizza pz=null;
		try {
			con = DriverManager.getConnection(url, username, password);
			pstmt=con.prepareStatement("SELECT * FROM pizza");
			ResultSet rs=pstmt.executeQuery();
			/*
+----------+------------+------+---------------+
| pizza_id | pizza_name | cost | delivery_date |
+----------+------------+------+---------------+
|      100 | chicken    |  700 | 2023-08-29    |
|      200 | veg        |  400 | 2023-08-12    |
+----------+------------+------+---------------+*/
			list=new ArrayList<>();
			while(rs.next()) { 
				pz=new Pizza();
				pz.setPizzaId(rs.getInt(1));
				pz.setPizzaName(rs.getString(2));
				pz.setCost(rs.getInt(3));
				pz.setDeliveryDate(rs.getDate(4).toLocalDate());
				list.add(pz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deletePizza(Pizza pizza) {
		// // jdbc code delete a pizza delete sql
		return 0;
	}

	@Override
	public Pizza updatePizza(Pizza pizza) {
		// // jdbc code delete a pizza update sql
		return null;
	}

}
