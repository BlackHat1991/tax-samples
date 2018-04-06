package secure_bulkitr;

import in.gov.incometaxindiaefiling.ditsecws.BulkItrService;
import in.gov.incometaxindiaefiling.ditsecws.BulkItrService_Service;
import in.gov.incometaxindiaefiling.ditsecws.request.BulkItrRequest;
import in.gov.incometaxindiaefiling.ditsecws.response.BulkItrResponse;
import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;

public class Secure_BulkITR
{
  public Secure_BulkITR() {}
  
  public static void main(String[] args)
  {
    String xmlFileName = args[0];
    
    System.out.println(SubmitITR(xmlFileName));
  }
  






  public static String SubmitITR(String xmlFileName)
  {
    SpringBusFactory bf = new SpringBusFactory();
    
    String response = null;
    
    File busFile = new File("secure_bulkitr/ClientConfig.xml");
    

    Bus bus = bf.createBus(busFile.toString());
    org.apache.cxf.BusFactory.setDefaultBus(bus);
    
    FileDataSource fileDataSource = new FileDataSource(xmlFileName);
    DataHandler itrXMLFileData = new DataHandler(fileDataSource);
    

    BulkItrService_Service ss = new BulkItrService_Service();
    BulkItrService port = (BulkItrService)ss.getPort(BulkItrService.class);
    
    try
    {
      BulkItrRequest ditRequest = new BulkItrRequest();
      ditRequest.setUniqueRequestId("ERIA100341-" + getRandomNumber());
      ditRequest.setDataHandler(itrXMLFileData);
      
      BulkItrResponse resp = port.uploadBulkItr(ditRequest);
      
      response = resp.getTokenNumber();

    }
    catch (Exception e)
    {
      response = "Error is :" + e.getMessage();
    }
    
    return response;
  }
  
  private static String getRandomNumber() {
    Random rnd = new Random();
    int n = 100000 + rnd.nextInt(900000);
    
    return String.valueOf(n);
  }
}
