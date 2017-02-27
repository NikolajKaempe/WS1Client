/**
 * ProcentageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class ProcentageServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.ProcentageService {

    public ProcentageServiceLocator() {
    }


    public ProcentageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcentageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Procentage
    private java.lang.String Procentage_address = "http://localhost:8080/WS1/services/Procentage";

    public java.lang.String getProcentageAddress() {
        return Procentage_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcentageWSDDServiceName = "Procentage";

    public java.lang.String getProcentageWSDDServiceName() {
        return ProcentageWSDDServiceName;
    }

    public void setProcentageWSDDServiceName(java.lang.String name) {
        ProcentageWSDDServiceName = name;
    }

    public DefaultNamespace.Procentage getProcentage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Procentage_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcentage(endpoint);
    }

    public DefaultNamespace.Procentage getProcentage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.ProcentageSoapBindingStub _stub = new DefaultNamespace.ProcentageSoapBindingStub(portAddress, this);
            _stub.setPortName(getProcentageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcentageEndpointAddress(java.lang.String address) {
        Procentage_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Procentage.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.ProcentageSoapBindingStub _stub = new DefaultNamespace.ProcentageSoapBindingStub(new java.net.URL(Procentage_address), this);
                _stub.setPortName(getProcentageWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Procentage".equals(inputPortName)) {
            return getProcentage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "ProcentageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Procentage"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Procentage".equals(portName)) {
            setProcentageEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
