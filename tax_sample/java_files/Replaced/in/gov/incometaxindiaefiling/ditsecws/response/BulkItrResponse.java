package in.gov.incometaxindiaefiling.ditsecws.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;






























@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BulkItrResponse", propOrder={"tokenNumber"})
public class BulkItrResponse
  extends DitResponse
{
  protected String tokenNumber;
  
  public BulkItrResponse() {}
  
  public String getTokenNumber()
  {
    return tokenNumber;
  }
  







  public void setTokenNumber(String value)
  {
    tokenNumber = value;
  }
}
