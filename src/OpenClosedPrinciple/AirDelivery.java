package OpenClosedPrinciple;

public class AirDelivery implements Delivery {
   public void shipItem(Product p) {
      System.out.println("Shipping Product By Air " + p.getProductName());
   }
}
