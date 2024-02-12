package SolidPrinciples.Solid;

public class Main {
   public static void main(String[] args) {
      Employee emp1 = new Employee("Nitin");
      emp1.setLoggedOut();
      String empName = emp1.getName();
      System.out.println("Employee Name: " + empName + " fetched from class Employee");
      TimeSheetReport t = new TimeSheetReport();
      t.print(emp1);
   }
}
