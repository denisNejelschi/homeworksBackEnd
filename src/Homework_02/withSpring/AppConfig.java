package Homework_02.withSpring;

import Homework_02.old_method.Things.administrative.SmartHomeApp;
import Homework_02.old_method.Things.executive.ClimateUnit;
import Homework_02.old_method.Things.executive.CoffeeMachine;
import Homework_02.old_method.Things.executive.VacuumCleaner;
import Homework_02.old_method.Things.transmitting.Router;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Homework_02")//тут пришлось воспользоваться GPT
public class AppConfig {

  @Bean
  public ClimateUnit climateUnit() {
    return new ClimateUnit();
  }

  @Bean
  public Router router() {
    return new Router();
  }

  @Bean
  public VacuumCleaner vacuumCleaner() {
    return new VacuumCleaner();
  }

  @Bean
  public CoffeeMachine coffeeMachine() {
    return new CoffeeMachine();
  }

  @Bean
  public SmartHomeApp smartHomeApp() {
    SmartHomeApp app = new SmartHomeApp();
    app.setClimateUnit(climateUnit());
    app.setRouter(router());
    app.setVacuumCleaner(vacuumCleaner());
    app.setCoffeeMachine(coffeeMachine());
    return app;
  }
}
