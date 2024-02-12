package SolidPrinciples.LiskovSubstitutionPrinciple;

public class MotorCycle extends Vehicle {
   private Boolean isEngine;

   MotorCycle(Integer speed, Boolean isEngine) {
      super(speed);
      this.isEngine = isEngine;
   }

   public void printDetails() {
      System.out.println("Vehicle has speed " + this.speed + " kmp/h and engine is " + this.isEngine);
   }
}
