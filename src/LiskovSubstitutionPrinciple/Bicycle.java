package LiskovSubstitutionPrinciple;

public class Bicycle extends Vehicle {
   Bicycle(Integer speed) {
      super(speed);
   }

   public void printDetails() {
      System.out.println("Vehicle has speed of " + this.speed + " kmp/h and has No Engine");
   }
}
