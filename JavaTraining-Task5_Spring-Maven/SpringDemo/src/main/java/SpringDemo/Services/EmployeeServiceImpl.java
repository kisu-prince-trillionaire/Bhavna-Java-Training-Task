package SpringDemo.Services;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDemo.Dao.EmployeeDao;
import SpringDemo.Entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	
	EmployeeServiceImpl(){
		empLst.add(new Employee(1,"Rahul","2022-07-12",111,"HR",100000,"Active"));
	}
	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//empLst.add(emp);
		employeeDao.save(emp);
		System.out.println("Data Added successfully");
		
	}

	@Override
	public List<Employee> getActiveEmployees() {
		// TODO Auto-generated method stub
		//List<Employee> res=empLst.stream().filter(s->s.getStatus().contentEquals("Active")).collect(Collectors.toList());
		return employeeDao.findAll().stream().filter(s->s.getStatus().contentEquals("Active")).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee searchEmployee(int eId) {
		// TODO Auto-generated method stub
		//(Employee)empLst.stream().filter(s->s.getEmpId()==eId);
		return employeeDao.getReferenceById(eId);
	}

}
