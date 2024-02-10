package OpenClosedPrinciple;

public class Main {
   public static void main(String[] args) {
      Delivery airDelivery = new AirDelivery();
      new RoadwayDelivery();
      Product laptop = new Product("Macbook-M1", 2, ProductCategory.ELECTRONICS);
      laptop.setShippingType(airDelivery);
      laptop.shipProduct();
   }
}
