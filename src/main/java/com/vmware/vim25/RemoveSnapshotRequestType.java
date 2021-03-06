
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveSnapshotRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveSnapshotRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="removeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="consolidate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSnapshotRequestType", propOrder = {
    "_this",
    "removeChildren",
    "consolidate"
})
public class RemoveSnapshotRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected boolean removeChildren;
    protected Boolean consolidate;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the removeChildren property.
     * 
     */
    public boolean isRemoveChildren() {
        return removeChildren;
    }

    /**
     * Sets the value of the removeChildren property.
     * 
     */
    public void setRemoveChildren(boolean value) {
        this.removeChildren = value;
    }

    /**
     * Gets the value of the consolidate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidate() {
        return consolidate;
    }

    /**
     * Sets the value of the consolidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidate(Boolean value) {
        this.consolidate = value;
    }

}
