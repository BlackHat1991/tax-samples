package in.gov.incometaxindiaefiling.ditsecws.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

















@XmlRegistry
public class ObjectFactory
{
  private static final QName _BulkItrResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "BulkItrResponse");
  private static final QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");
  




  public ObjectFactory() {}
  




  public DitResponse createDitResponse()
  {
    return new DitResponse();
  }
  



  public BulkItrResponse createBulkItrResponse()
  {
    return new BulkItrResponse();
  }
  



  @XmlElementDecl(namespace="http://incometaxindiaefiling.gov.in/ditsecws/response", name="BulkItrResponse")
  public JAXBElement<BulkItrResponse> createBulkItrResponse(BulkItrResponse value)
  {
    return new JAXBElement(_BulkItrResponse_QNAME, BulkItrResponse.class, null, value);
  }
  



  @XmlElementDecl(namespace="http://incometaxindiaefiling.gov.in/ditsecws/response", name="DitResponse")
  public JAXBElement<DitResponse> createDitResponse(DitResponse value)
  {
    return new JAXBElement(_DitResponse_QNAME, DitResponse.class, null, value);
  }
}
