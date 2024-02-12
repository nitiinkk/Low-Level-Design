package SolidPrinciples.Solid;

import java.io.PrintStream;

public class TimeSheetReport {
   Employee emp;

   public void print(Employee emp) {
      PrintStream var10000 = System.out;
      String var10001 = emp.getName();
      var10000.println("printing timesheet report for Employee: " + var10001 + " worked from " + emp.getLoggedInDetails() + " to " + emp.getLoggedOutDetails());
   }
}
