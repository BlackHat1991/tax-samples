package common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;


public class SecWsPasswordCallback
  implements CallbackHandler
{
  private Map<String, String> passwords = new HashMap();
  
  public SecWsPasswordCallback() {
    passwords.put("ERIA100341", "@Satish6565");
  }
  




  public void handle(Callback[] callbacks)
    throws IOException, UnsupportedCallbackException
  {
    for (int i = 0; i < callbacks.length; i++) {
      WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
      
      String pass = (String)passwords.get(pc.getIdentifier());
      if (pass != null) {
        pc.setPassword(pass);
        return;
      }
    }
  }
  


  public void setAliasPassword(String alias, String password)
  {
    passwords.put(alias, password);
  }
}
