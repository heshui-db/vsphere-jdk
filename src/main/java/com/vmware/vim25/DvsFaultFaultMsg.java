
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DvsFaultFault", targetNamespace = "urn:vim25")
public class DvsFaultFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DvsFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DvsFaultFaultMsg(String message, DvsFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DvsFaultFaultMsg(String message, DvsFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.DvsFault
     */
    public DvsFault getFaultInfo() {
        return faultInfo;
    }

}
