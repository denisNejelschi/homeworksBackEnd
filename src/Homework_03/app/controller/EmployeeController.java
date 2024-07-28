package Homework_03.app.controller;

import Homework_03.app.domain.Employee;
import Homework_03.app.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
  private final EmployeeService service;

  public EmployeeController(EmployeeService service) {
    this.service = service;
  }

  public Employee getEmployee(int id) {
    return service.getEmployee(id);
  }
}
