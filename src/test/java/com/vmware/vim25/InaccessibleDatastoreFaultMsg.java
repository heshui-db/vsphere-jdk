
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InaccessibleDatastoreFault", targetNamespace = "urn:vim25")
public class InaccessibleDatastoreFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InaccessibleDatastore faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InaccessibleDatastoreFaultMsg(String message, InaccessibleDatastore faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InaccessibleDatastoreFaultMsg(String message, InaccessibleDatastore faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.InaccessibleDatastore
     */
    public InaccessibleDatastore getFaultInfo() {
        return faultInfo;
    }

}