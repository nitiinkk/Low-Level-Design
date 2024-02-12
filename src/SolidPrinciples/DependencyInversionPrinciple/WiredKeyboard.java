package SolidPrinciples.DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard {
   public void type() {
      System.out.println("Wired Keyboard....");
   }
}
