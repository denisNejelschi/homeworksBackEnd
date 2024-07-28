package Homework_02.withSpring;

import Homework_02.old_method.Things.administrative.SmartHomeApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    SmartHomeApp app = context.getBean(SmartHomeApp.class);
    app.doSomething();
    context.close();
  }
}
