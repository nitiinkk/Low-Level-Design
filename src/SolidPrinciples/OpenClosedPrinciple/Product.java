package SolidPrinciples.OpenClosedPrinciple;

public class Product {
   private String productName;
   private Integer weight;
   private ProductCategory category;
   private Delivery deliveryMethod;

   Product(String productName, Integer weight, ProductCategory category) {
      this.productName = productName;
      this.weight = weight;
      this.category = category;
   }

   public void setShippingType(Delivery deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
   }

   public String getProductName() {
      return this.productName;
   }

   public void shipProduct() {
      this.deliveryMethod.shipItem(this);
   }
}
