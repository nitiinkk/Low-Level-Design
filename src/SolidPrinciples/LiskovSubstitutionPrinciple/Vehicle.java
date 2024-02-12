package SolidPrinciples.LiskovSubstitutionPrinciple;

public class Vehicle {
   Integer speed;

   Vehicle(Integer speed) {
      this.speed = speed;
   }

   public void printDetails() {
      System.out.println("print vehicle details...");
   }
}
