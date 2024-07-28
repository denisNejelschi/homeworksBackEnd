package Homework_03.app.repository;

import Homework_03.app.domain.Employee;

public interface EmployeeRepository {
  Employee getEmployee(int id);
}
