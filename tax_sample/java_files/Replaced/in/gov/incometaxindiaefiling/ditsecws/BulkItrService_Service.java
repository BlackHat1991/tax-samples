package in.gov.incometaxindiaefiling.ditsecws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;










@WebServiceClient(name="BulkItrService", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws", wsdlLocation="https://incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkItrService?wsdl")
public class BulkItrService_Service
  extends Service
{
  private static final URL BULKITRSERVICE_WSDL_LOCATION;
  private static final WebServiceException BULKITRSERVICE_EXCEPTION;
  private static final QName BULKITRSERVICE_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrService");
  
  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("https://incometaxindiaefiling.gov.in/e-FilingSecWS/ditsecws/BulkItrService?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    BULKITRSERVICE_WSDL_LOCATION = url;
    BULKITRSERVICE_EXCEPTION = e;
  }
  
  public BulkItrService_Service() {
    super(__getWsdlLocation(), BULKITRSERVICE_QNAME);
  }
  
  public BulkItrService_Service(WebServiceFeature... features) {
    super(__getWsdlLocation(), BULKITRSERVICE_QNAME, features);
  }
  
  public BulkItrService_Service(URL wsdlLocation) {
    super(wsdlLocation, BULKITRSERVICE_QNAME);
  }
  
  public BulkItrService_Service(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, BULKITRSERVICE_QNAME, features);
  }
  
  public BulkItrService_Service(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }
  
  public BulkItrService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }
  




  @WebEndpoint(name="BulkItrServicePort")
  public BulkItrService getBulkItrServicePort()
  {
    return (BulkItrService)super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrServicePort"), BulkItrService.class);
  }
  






  @WebEndpoint(name="BulkItrServicePort")
  public BulkItrService getBulkItrServicePort(WebServiceFeature... features)
  {
    return (BulkItrService)super.getPort(new QName("http://incometaxindiaefiling.gov.in/ditsecws", "BulkItrServicePort"), BulkItrService.class, features);
  }
  
  private static URL __getWsdlLocation() {
    if (BULKITRSERVICE_EXCEPTION != null) {
      throw BULKITRSERVICE_EXCEPTION;
    }
    return BULKITRSERVICE_WSDL_LOCATION;
  }
}
