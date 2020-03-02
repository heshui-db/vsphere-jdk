
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EvaluationLicenseSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluationLicenseSource">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:vim25}LicenseSource">
 *       &lt;sequence>
 *         &lt;element name="remainingHours" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationLicenseSource", propOrder = {
    "remainingHours"
})
public class EvaluationLicenseSource
    extends LicenseSource
{

    protected Long remainingHours;

    /**
     * Gets the value of the remainingHours property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingHours() {
        return remainingHours;
    }

    /**
     * Sets the value of the remainingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingHours(Long value) {
        this.remainingHours = value;
    }

}
