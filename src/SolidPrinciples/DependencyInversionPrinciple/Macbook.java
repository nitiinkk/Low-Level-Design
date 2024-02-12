package SolidPrinciples.DependencyInversionPrinciple;

public class Macbook {
   Keyboard keyboard;
   private String modelName = "Macbook PRO M1";
   private String color;
   private Integer releaseYear;

   Macbook(String color) {
      this.color = color;
      this.releaseYear = 2024;
   }

   public void setKeyboard(Keyboard keyboard) {
      this.keyboard = keyboard;
   }

   public void type() {
      this.keyboard.type();
   }
}
