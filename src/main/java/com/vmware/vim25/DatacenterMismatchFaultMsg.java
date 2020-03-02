
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DatacenterMismatchFault", targetNamespace = "urn:vim25")
public class DatacenterMismatchFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DatacenterMismatch faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DatacenterMismatchFaultMsg(String message, DatacenterMismatch faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DatacenterMismatchFaultMsg(String message, DatacenterMismatch faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.DatacenterMismatch
     */
    public DatacenterMismatch getFaultInfo() {
        return faultInfo;
    }

}
