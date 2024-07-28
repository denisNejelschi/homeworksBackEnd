package Homework_03.app.service;

import Homework_03.app.domain.Employee;
import Homework_03.app.repository.EmployeeRepository;
import java.util.Random;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  private final Random random = new Random();
  private final EmployeeRepository employeeRepository;

  public EmployeeServiceImpl(
      @Qualifier("employeeRepositoryList") EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @Override
  public Employee getEmployee(int id) {
    Employee employee = employeeRepository.getEmployee(id);
    if (employee != null) {
      setAccessId(employee);
    }
    return employee;
  }

  public String generateRandomString(String name, int age) {
    int range = name.length() + age;
    StringBuilder randomString = new StringBuilder();

    for (int i = 0; i < range; i++) {
      int randomIndex = random.nextInt(name.length());
      char randomChar = name.charAt(randomIndex);
      randomString.append(randomChar);
    }

    return randomString.toString();
  }

  private void setAccessId(Employee employee) {
    String access = generateRandomString(employee.getName(), employee.getAge());
    employee.setAccessId(access);
  }
}
