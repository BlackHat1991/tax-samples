package in.gov.incometaxindiaefiling.ditsecws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


































@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DitResponse", propOrder={"errorCode", "errorDesc"})
@XmlSeeAlso({BulkItrResponse.class})
public class DitResponse
{
  @XmlElement(name="ErrorCode")
  protected String errorCode;
  @XmlElement(name="ErrorDesc")
  protected String errorDesc;
  @XmlAttribute(name="uniqueRequestId", required=true)
  protected String uniqueRequestId;
  
  public DitResponse() {}
  
  public String getErrorCode()
  {
    return errorCode;
  }
  







  public void setErrorCode(String value)
  {
    errorCode = value;
  }
  







  public String getErrorDesc()
  {
    return errorDesc;
  }
  







  public void setErrorDesc(String value)
  {
    errorDesc = value;
  }
  







  public String getUniqueRequestId()
  {
    return uniqueRequestId;
  }
  







  public void setUniqueRequestId(String value)
  {
    uniqueRequestId = value;
  }
}
