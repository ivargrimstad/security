//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.11 at 03:07:41 PM IST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.appclient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "javaMethodOrOperationName"
})
@XmlRootElement(name = "message")
public class Message
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "java-method", type = JavaMethod.class),
        @XmlElement(name = "operation-name", type = OperationName.class)
    })
    protected List<Serializable> javaMethodOrOperationName;

    /**
     * Gets the value of the javaMethodOrOperationName property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the javaMethodOrOperationName property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getJavaMethodOrOperationName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JavaMethod }
     * {@link OperationName }
     * 
     * 
     */
    public List<Serializable> getJavaMethodOrOperationName() {
        if (javaMethodOrOperationName == null) {
            javaMethodOrOperationName = new ArrayList<Serializable>();
        }
        return this.javaMethodOrOperationName;
    }

}
