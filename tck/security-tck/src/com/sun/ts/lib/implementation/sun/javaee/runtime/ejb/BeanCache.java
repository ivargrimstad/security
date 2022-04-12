//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.11 at 03:08:25 PM IST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxCacheSize",
    "resizeQuantity",
    "isCacheOverflowAllowed",
    "cacheIdleTimeoutInSeconds",
    "removalTimeoutInSeconds",
    "victimSelectionPolicy"
})
@XmlRootElement(name = "bean-cache")
public class BeanCache
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "max-cache-size")
    protected String maxCacheSize;
    @XmlElement(name = "resize-quantity")
    protected String resizeQuantity;
    @XmlElement(name = "is-cache-overflow-allowed")
    protected String isCacheOverflowAllowed;
    @XmlElement(name = "cache-idle-timeout-in-seconds")
    protected String cacheIdleTimeoutInSeconds;
    @XmlElement(name = "removal-timeout-in-seconds")
    protected String removalTimeoutInSeconds;
    @XmlElement(name = "victim-selection-policy")
    protected String victimSelectionPolicy;

    /**
     * Gets the value of the maxCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCacheSize() {
        return maxCacheSize;
    }

    /**
     * Sets the value of the maxCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCacheSize(String value) {
        this.maxCacheSize = value;
    }

    /**
     * Gets the value of the resizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResizeQuantity() {
        return resizeQuantity;
    }

    /**
     * Sets the value of the resizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResizeQuantity(String value) {
        this.resizeQuantity = value;
    }

    /**
     * Gets the value of the isCacheOverflowAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCacheOverflowAllowed() {
        return isCacheOverflowAllowed;
    }

    /**
     * Sets the value of the isCacheOverflowAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCacheOverflowAllowed(String value) {
        this.isCacheOverflowAllowed = value;
    }

    /**
     * Gets the value of the cacheIdleTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheIdleTimeoutInSeconds() {
        return cacheIdleTimeoutInSeconds;
    }

    /**
     * Sets the value of the cacheIdleTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheIdleTimeoutInSeconds(String value) {
        this.cacheIdleTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the removalTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovalTimeoutInSeconds() {
        return removalTimeoutInSeconds;
    }

    /**
     * Sets the value of the removalTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovalTimeoutInSeconds(String value) {
        this.removalTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the victimSelectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVictimSelectionPolicy() {
        return victimSelectionPolicy;
    }

    /**
     * Sets the value of the victimSelectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVictimSelectionPolicy(String value) {
        this.victimSelectionPolicy = value;
    }

}
