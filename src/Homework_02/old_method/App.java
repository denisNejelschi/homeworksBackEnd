package Homework_02.old_method;

import Homework_02.old_method.Things.administrative.SmartHomeApp;
import Homework_02.old_method.Things.executive.ClimateUnit;
import Homework_02.old_method.Things.executive.CoffeeMachine;
import Homework_02.old_method.Things.executive.VacuumCleaner;
import Homework_02.old_method.Things.transmitting.Router;

public class App {

  public static void main(String[] args) {

    ClimateUnit climateUnit = new ClimateUnit();
    Router router = new Router();
    VacuumCleaner vacuumCleaner = new VacuumCleaner();
    CoffeeMachine coffeeMachine = new CoffeeMachine();


    SmartHomeApp app = new SmartHomeApp();
    app.setClimateUnit(climateUnit);
    app.setRouter(router);
    app.setVacuumCleaner(vacuumCleaner);
    app.setCoffeeMachine(coffeeMachine);


    app.doSomething();
  }
}
