package DependencyInversionPrinciple;

public class Main {
   public static void main(String[] args) {
      Macbook m1 = new Macbook("Grey");
      Keyboard bk = new BluetoothKeyboard();
      m1.setKeyboard(bk);
      m1.type();
   }
}
