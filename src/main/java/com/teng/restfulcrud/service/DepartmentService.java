package com.teng.restfulcrud.service;

import com.teng.restfulcrud.dao.DepartmentDao;
import com.teng.restfulcrud.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author shkstart
 * @create 2021-06-12 17:25
 */
@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    public Collection<Department> getDepts() {
        return departmentDao.getDepartments();
    }
}
