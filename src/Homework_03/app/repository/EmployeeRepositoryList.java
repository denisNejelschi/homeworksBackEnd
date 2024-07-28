package Homework_03.app.repository;

import Homework_03.app.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryList implements EmployeeRepository {

  private final List<Employee> database = new ArrayList<>();

  public EmployeeRepositoryList() {
    database.add(new Employee(1, "John", "Doe", 26, 2600.00));
    database.add(new Employee(2, "Neo", "FromMatrix", 29, 2800.00));
    database.add(new Employee(3, "Karl", "FromKlara", 30, 2650.00));
    database.add(new Employee(4, "Emilian", "FromPecikin", 26, 2000.00));
  }

  @Override
  public Employee getEmployee(int id) {
    return database.stream()
        .filter(x -> Objects.equals(x.getId(), id))
        .findFirst()
        .orElse(null);
  }
}
