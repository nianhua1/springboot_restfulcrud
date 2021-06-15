package com.teng.restfulcrud.controller;

import com.teng.restfulcrud.entities.Department;
import com.teng.restfulcrud.entities.Employee;
import com.teng.restfulcrud.service.DepartmentService;
import com.teng.restfulcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author
 * @create 2021-06-12 15:56
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/emps")
    public String getEmps(Model model){
        Collection<Employee> employees = employeeService.getAllEmp();
        model.addAttribute("emps",employees);
        return "emp/list";
    }


    @GetMapping("/emp")
    public String toAddEmpPage(Model model){
        System.out.println("添加员工页面");
        Collection<Department> departments = departmentService.getDepts();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    /**
     * 保存员工
     */
    @PostMapping("/emp")
    public String saveEmp(Employee employee){
        System.out.println(employee);
        employeeService.saveEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 来到修改员工页面
     */
    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id,Model model){
        System.out.println("修改员工页面");
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departmentService.getDepts();
        model.addAttribute("depts",departments);

        return "emp/add";
    }

    /**
     * 修改员工
     */
    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeService.saveEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 删除员工
     */
    @DeleteMapping("/emp/{id}")
    @ResponseBody
    public String deleteEmp(@PathVariable("id")Integer id){
        System.out.println(id+"===========");
        employeeService.deleteEmpById(id);
        return "";
    }
}
