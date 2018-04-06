package in.gov.incometaxindiaefiling.ditsecws;

import in.gov.incometaxindiaefiling.ditsecws.request.BulkItrRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;





























@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="uploadBulkItr", propOrder={"ditRequest"})
public class UploadBulkItr
{
  @XmlElement(name="DitRequest", required=true)
  protected BulkItrRequest ditRequest;
  
  public UploadBulkItr() {}
  
  public BulkItrRequest getDitRequest()
  {
    return ditRequest;
  }
  







  public void setDitRequest(BulkItrRequest value)
  {
    ditRequest = value;
  }
}
