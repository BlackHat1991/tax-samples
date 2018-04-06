package in.gov.incometaxindiaefiling.ditsecws.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

















@XmlRegistry
public class ObjectFactory
{
  private static final QName _BulkItrRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "BulkItrRequest");
  




  public ObjectFactory() {}
  




  public BulkItrRequest createBulkItrRequest()
  {
    return new BulkItrRequest();
  }
  



  @XmlElementDecl(namespace="http://incometaxindiaefiling.gov.in/ditsecws/request", name="BulkItrRequest")
  public JAXBElement<BulkItrRequest> createBulkItrRequest(BulkItrRequest value)
  {
    return new JAXBElement(_BulkItrRequest_QNAME, BulkItrRequest.class, null, value);
  }
}
