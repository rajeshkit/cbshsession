package in.hsbc.service;

import java.util.ArrayList;

import in.hsbc.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public int addCustomer(Customer customer) {
		//it recieves customer object from the presentation
		//business logic to executed before we add
		// customer to the dao implementation class
		return 0;
	}

	@Override
	public ArrayList<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
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
