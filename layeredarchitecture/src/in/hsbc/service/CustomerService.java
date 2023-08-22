package in.hsbc.service;

import java.util.ArrayList;

import in.hsbc.model.Customer;

public interface CustomerService {
	public int addCustomer(Customer customer);
	public ArrayList<Customer> getAllCustomers();
	public Customer getCustomerById(int customerId);
	public int deleteCustomerById(int customerId);
	public Customer updateCustomer(Customer customer);
}
