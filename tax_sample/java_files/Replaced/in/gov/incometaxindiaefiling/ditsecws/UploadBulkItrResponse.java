package in.gov.incometaxindiaefiling.ditsecws;

import in.gov.incometaxindiaefiling.ditsecws.response.BulkItrResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;





























@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="uploadBulkItrResponse", propOrder={"result"})
public class UploadBulkItrResponse
{
  protected BulkItrResponse result;
  
  public UploadBulkItrResponse() {}
  
  public BulkItrResponse getResult()
  {
    return result;
  }
  







  public void setResult(BulkItrResponse value)
  {
    result = value;
  }
}
