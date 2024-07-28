package Homework_02.old_method.Things.administrative;

import Homework_02.old_method.Things.executive.ClimateUnit;
import Homework_02.old_method.Things.executive.CoffeeMachine;
import Homework_02.old_method.Things.executive.VacuumCleaner;
import Homework_02.old_method.Things.transmitting.Router;

public class SmartHomeApp {
  private ClimateUnit climateUnit;
  private Router router;
  private VacuumCleaner vacuumCleaner;
  private CoffeeMachine coffeeMachine;

  public void setClimateUnit(ClimateUnit climateUnit) {
    this.climateUnit = climateUnit;
  }

  public void setRouter(Router router) {
    this.router = router;
  }

  public void setVacuumCleaner(VacuumCleaner vacuumCleaner) {
    this.vacuumCleaner = vacuumCleaner;
  }

  public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  public void doSomething() {
     router.transmit();
     vacuumCleaner.clean();
     coffeeMachine.makeCoffee();
     climateUnit.createComfort();
  }
}
