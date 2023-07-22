package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep : emp repo i.f
	@Autowired //by type : Field Level DI
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee transientEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(transientEmp);
	}

	@Override
	public Employee updateEmployee(Employee detachedEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(detachedEmp);
	}
	
	@Override
	public String deleteEmployee(Long empid ) {
		// TODO Auto-generated method stub
		empRepo.deleteById(empid);
		return "mesg:Employee Deleted Successfully" ;

	}

	@Override
	public Employee getEmpByName(String name) {
		// TODO Auto-generated method stub
		return empRepo.findByfirstName(name);
	}
	
}