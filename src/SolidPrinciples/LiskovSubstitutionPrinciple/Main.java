package SolidPrinciples.LiskovSubstitutionPrinciple;

public class Main {
   public static void main(String[] args) {
      Vehicle bicycle = new Bicycle(10);
      Vehicle motorcycle = new MotorCycle(50, true);
      bicycle.printDetails();
      motorcycle.printDetails();
   }
}
