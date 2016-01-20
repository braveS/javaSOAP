
package org.netbeans.xml.schema.newxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUctu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idPrednasky">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idUctu",
    "idPrednasky"
})
@XmlRootElement(name = "RegistraciaRequest")
public class RegistraciaRequest {

    @XmlElement(required = true)
    protected String idUctu;
    @XmlElement(required = true)
    protected String idPrednasky;

    /**
     * Gets the value of the idUctu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUctu() {
        return idUctu;
    }

    /**
     * Sets the value of the idUctu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUctu(String value) {
        this.idUctu = value;
    }

    /**
     * Gets the value of the idPrednasky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPrednasky() {
        return idPrednasky;
    }

    /**
     * Sets the value of the idPrednasky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPrednasky(String value) {
        this.idPrednasky = value;
    }

}
