//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.11 at 03:08:25 PM IST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    "methodParam"
})
@XmlRootElement(name = "method-params")
public class MethodParams
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "method-param")
    protected List<MethodParam> methodParam;

    /**
     * Gets the value of the methodParam property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the methodParam property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMethodParam().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MethodParam }
     * 
     * 
     */
    public List<MethodParam> getMethodParam() {
        if (methodParam == null) {
            methodParam = new ArrayList<MethodParam>();
        }
        return this.methodParam;
    }

}
