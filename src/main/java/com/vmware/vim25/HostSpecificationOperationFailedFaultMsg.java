
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "HostSpecificationOperationFailedFault", targetNamespace = "urn:vim25")
public class HostSpecificationOperationFailedFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private HostSpecificationOperationFailed faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public HostSpecificationOperationFailedFaultMsg(String message, HostSpecificationOperationFailed faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public HostSpecificationOperationFailedFaultMsg(String message, HostSpecificationOperationFailed faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.HostSpecificationOperationFailed
     */
    public HostSpecificationOperationFailed getFaultInfo() {
        return faultInfo;
    }

}
