package Homework_03.client;

import Homework_03.app.controller.EmployeeController;
import Homework_03.app.domain.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext("Homework_03.app");
    EmployeeController controller = context.getBean(EmployeeController.class);
    Employee employee = controller.getEmployee(2);
    System.out.println(employee);
  }
}
