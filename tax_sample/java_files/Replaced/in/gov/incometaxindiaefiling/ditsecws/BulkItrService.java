package in.gov.incometaxindiaefiling.ditsecws;

import in.gov.incometaxindiaefiling.ditsecws.request.BulkItrRequest;
import in.gov.incometaxindiaefiling.ditsecws.response.BulkItrResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="BulkItrService", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws")
@XmlSeeAlso({ObjectFactory.class, in.gov.incometaxindiaefiling.ditsecws.request.ObjectFactory.class, in.gov.incometaxindiaefiling.ditsecws.response.ObjectFactory.class})
public abstract interface BulkItrService
{
  @WebMethod
  @WebResult(name="result", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws")
  @RequestWrapper(localName="uploadBulkItr", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws", className="in.gov.incometaxindiaefiling.ditsecws.UploadBulkItr")
  @ResponseWrapper(localName="uploadBulkItrResponse", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws", className="in.gov.incometaxindiaefiling.ditsecws.UploadBulkItrResponse")
  public abstract BulkItrResponse uploadBulkItr(@WebParam(name="DitRequest", targetNamespace="http://incometaxindiaefiling.gov.in/ditsecws") BulkItrRequest paramBulkItrRequest);
}
