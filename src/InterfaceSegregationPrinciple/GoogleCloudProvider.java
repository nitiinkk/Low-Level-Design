package InterfaceSegregationPrinciple;

public class GoogleCloudProvider implements Hosting, Storage, Metric {
   public void setServer() {
      System.out.println("Server setup success from Google");
   }

   public void setRedis() {
      System.out.println("Spinned up Redis Database from Google");
   }

   public void cloudWatchLogs() {
      System.out.println("Logging Key Metrics...from Google");
   }
}
