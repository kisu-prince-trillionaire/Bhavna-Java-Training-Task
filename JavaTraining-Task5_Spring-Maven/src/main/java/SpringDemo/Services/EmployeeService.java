package SpringDemo.Services;

import java.util.ArrayList;
import java.util.List;

import SpringDemo.Entity.Employee;

public interface EmployeeService {
	List<Employee> empLst=new ArrayList<Employee>();
	public void addEmployee(Employee emp);
	
	public List<Employee> getActiveEmployees();
	
	public List<Employee> getEmployees();
	
	public Employee searchEmployee(int eId);

}
