package in.gov.incometaxindiaefiling.ditsecws.request;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;




































@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BulkItrRequest", propOrder={"dataHandler"})
public class BulkItrRequest
{
  @XmlElement(required=true)
  @XmlMimeType("application/octet-stream")
  protected DataHandler dataHandler;
  @XmlAttribute(name="uniqueRequestId", required=true)
  protected String uniqueRequestId;
  
  public BulkItrRequest() {}
  
  public DataHandler getDataHandler()
  {
    return dataHandler;
  }
  







  public void setDataHandler(DataHandler value)
  {
    dataHandler = value;
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
