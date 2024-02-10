package Solid;

import java.time.LocalTime;

public class Employee {
   private String name;
   private LocalTime loggedIn;
   private LocalTime loggedOut;

   Employee(String name) {
      this.name = name;
      this.loggedIn = LocalTime.now();
   }

   public String getName() {
      return this.name;
   }

   public void setLoggedOut() {
      this.loggedOut = LocalTime.now();
   }

   public LocalTime getLoggedInDetails() {
      return this.loggedIn;
   }

   public LocalTime getLoggedOutDetails() {
      return this.loggedOut;
   }
}
