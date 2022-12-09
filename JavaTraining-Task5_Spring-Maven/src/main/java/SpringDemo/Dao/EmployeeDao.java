package SpringDemo.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import SpringDemo.Entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
