package OpenClosedPrinciple;

public class RoadwayDelivery implements Delivery {
   public void shipItem(Product p) {
      System.out.println("Shipping product By Roadways " + p.getProductName());
   }
}
