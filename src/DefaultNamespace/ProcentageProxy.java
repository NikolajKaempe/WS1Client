package DefaultNamespace;

public class ProcentageProxy implements DefaultNamespace.Procentage {
  private String _endpoint = null;
  private DefaultNamespace.Procentage procentage = null;
  
  public ProcentageProxy() {
    _initProcentageProxy();
  }
  
  public ProcentageProxy(String endpoint) {
    _endpoint = endpoint;
    _initProcentageProxy();
  }
  
  private void _initProcentageProxy() {
    try {
      procentage = (new DefaultNamespace.ProcentageServiceLocator()).getProcentage();
      if (procentage != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)procentage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)procentage)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (procentage != null)
      ((javax.xml.rpc.Stub)procentage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Procentage getProcentage() {
    if (procentage == null)
      _initProcentageProxy();
    return procentage;
  }
  
  public double calculateRest(double value) throws java.rmi.RemoteException{
    if (procentage == null)
      _initProcentageProxy();
    return procentage.calculateRest(value);
  }
  
  public double calculateProcentage(int value1, int value2) throws java.rmi.RemoteException{
    if (procentage == null)
      _initProcentageProxy();
    return procentage.calculateProcentage(value1, value2);
  }
  
  
}