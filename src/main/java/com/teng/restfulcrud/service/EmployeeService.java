package com.teng.restfulcrud.service;

import com.teng.restfulcrud.dao.EmployeeDao;
import com.teng.restfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author shkstart
 * @create 2021-06-12 15:57
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmp() {
        return employeeDao.getAll();
    }

    public void saveEmp(Employee employee) {
        employeeDao.save(employee);
    }

    public Employee getEmpById(Integer id) {
        return employeeDao.get(id);
    }

    public void deleteEmpById(Integer id) {
        employeeDao.delete(id);
    }
}
