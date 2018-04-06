package in.gov.incometaxindiaefiling.ditsecws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

















@XmlRegistry
public class ObjectFactory
{
  private static final QName _UploadBulkItrResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkItrResponse");
  private static final QName _UploadBulkItr_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkItr");
  




  public ObjectFactory() {}
  




  public UploadBulkItr createUploadBulkItr()
  {
    return new UploadBulkItr();
  }
  



  public UploadBulkItrResponse createUploadBulkItrResponse()
  {
    return new UploadBulkItrResponse();
  }
  



  @XmlElementDecl(namespace="http://incometaxindiaefiling.gov.in/ditsecws", name="uploadBulkItrResponse")
  public JAXBElement<UploadBulkItrResponse> createUploadBulkItrResponse(UploadBulkItrResponse value)
  {
    return new JAXBElement(_UploadBulkItrResponse_QNAME, UploadBulkItrResponse.class, null, value);
  }
  



  @XmlElementDecl(namespace="http://incometaxindiaefiling.gov.in/ditsecws", name="uploadBulkItr")
  public JAXBElement<UploadBulkItr> createUploadBulkItr(UploadBulkItr value)
  {
    return new JAXBElement(_UploadBulkItr_QNAME, UploadBulkItr.class, null, value);
  }
}
