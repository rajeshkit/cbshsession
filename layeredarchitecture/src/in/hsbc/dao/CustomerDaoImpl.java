package in.hsbc.dao;

import java.util.ArrayList;

import in.hsbc.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public int addCustomer(Customer customer) {
		//jdbc code -it get the customer object from service
		//it connects to db store customer object
		return 0;
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		//jdbc code - db to retive all the customer
		return null;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		//jdbc code - db to retive customer by id
		return null;
	}

	@Override
	public int deleteCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
