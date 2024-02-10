package InterfaceSegregationPrinciple;

public class AwsCloudProvider implements Metric {
   public void cloudWatchLogs() {
      System.out.println("Logging Key Metrics from AWS");
   }
}
