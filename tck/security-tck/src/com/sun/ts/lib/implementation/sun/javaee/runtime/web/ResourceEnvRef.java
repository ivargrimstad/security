//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.11 at 03:08:54 PM IST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.web;

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
    "resourceEnvRefName",
    "jndiName"
})
@XmlRootElement(name = "resource-env-ref")
public class ResourceEnvRef
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "resource-env-ref-name", required = true)
    protected String resourceEnvRefName;
    @XmlElement(name = "jndi-name", required = true)
    protected String jndiName;

    /**
     * Gets the value of the resourceEnvRefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceEnvRefName() {
        return resourceEnvRefName;
    }

    /**
     * Sets the value of the resourceEnvRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceEnvRefName(String value) {
        this.resourceEnvRefName = value;
    }

    /**
     * Gets the value of the jndiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJndiName() {
        return jndiName;
    }

    /**
     * Sets the value of the jndiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJndiName(String value) {
        this.jndiName = value;
    }

}
