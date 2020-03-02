
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CannotCreateFileFault", targetNamespace = "urn:vim25")
public class CannotCreateFileFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CannotCreateFile faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CannotCreateFileFaultMsg(String message, CannotCreateFile faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CannotCreateFileFaultMsg(String message, CannotCreateFile faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.CannotCreateFile
     */
    public CannotCreateFile getFaultInfo() {
        return faultInfo;
    }

}
