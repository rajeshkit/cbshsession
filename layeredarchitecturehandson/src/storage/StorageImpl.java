package storage;

import java.util.ArrayList;
import entity.Employee;
import exception.InvalidEmployeeNumberException;

public class StorageImpl implements Storage {
	static ArrayList<Employee> empList;//instance reference variable
	static {
		empList=new ArrayList<Employee>();
		
	}
	@Override
	public void addEmployee(Employee e) {
		empList.add(e);

	}

	@Override
	public Employee getEmployee(int empNo) throws InvalidEmployeeNumberException {
		if(empNo<=0) {
			throw new InvalidEmployeeNumberException();
		}
		for (Employee employee : empList) {
			if(employee.getEmpNo()==empNo) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		
		return empList;
	}

}
