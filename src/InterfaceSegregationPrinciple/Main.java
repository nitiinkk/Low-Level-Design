package InterfaceSegregationPrinciple;

public class Main {
   public static void main(String[] args) {
      AwsCloudProvider aws = new AwsCloudProvider();
      System.out.println("---- AWS ------");
      aws.cloudWatchLogs();
      System.out.println("---- Google ------");
      GoogleCloudProvider google = new GoogleCloudProvider();
      google.setServer();
      google.setRedis();
      google.cloudWatchLogs();
   }
}
