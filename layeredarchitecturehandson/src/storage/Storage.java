package storage;

import java.util.ArrayList;

import entity.Employee;
import exception.InvalidEmployeeNumberException;

public interface Storage {
	void addEmployee(Employee e);
	Employee getEmployee(int empNo) throws InvalidEmployeeNumberException;
	ArrayList<Employee> getAllEmployees();
}
