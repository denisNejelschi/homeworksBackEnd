package Homework_03.app.domain;

import java.util.Objects;

public class Employee {
  private int id;
  private String name;
  private String surname;
  private int age;
  private Double salary;
  private String accessId;

  public Employee(int id, String name, String surname, int age, Double salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public Double getSalary() {
    return salary;
  }

  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee employee)) {
      return false;
    }
    return Objects.equals(accessId, employee.accessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessId);
  }

  @Override
  public String toString() {
    return String.format("%s %s {facility access id is:='%s'}", name, surname, accessId);
  }
}
