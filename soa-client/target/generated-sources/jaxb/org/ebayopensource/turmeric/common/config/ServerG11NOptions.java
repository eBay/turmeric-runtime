//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 06:38:32 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerG11NOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerG11NOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supported-global-id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supported-locale" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="default-encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerG11NOptions", propOrder = {
    "supportedGlobalId",
    "supportedLocale",
    "defaultEncoding"
})
public class ServerG11NOptions {

    @XmlElement(name = "supported-global-id")
    protected List<String> supportedGlobalId;
    @XmlElement(name = "supported-locale")
    protected List<String> supportedLocale;
    @XmlElement(name = "default-encoding")
    protected String defaultEncoding;

    /**
     * Gets the value of the supportedGlobalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedGlobalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedGlobalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedGlobalId() {
        if (supportedGlobalId == null) {
            supportedGlobalId = new ArrayList<String>();
        }
        return this.supportedGlobalId;
    }

    /**
     * Gets the value of the supportedLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedLocale() {
        if (supportedLocale == null) {
            supportedLocale = new ArrayList<String>();
        }
        return this.supportedLocale;
    }

    /**
     * Gets the value of the defaultEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEncoding() {
        return defaultEncoding;
    }

    /**
     * Sets the value of the defaultEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEncoding(String value) {
        this.defaultEncoding = value;
    }

}
