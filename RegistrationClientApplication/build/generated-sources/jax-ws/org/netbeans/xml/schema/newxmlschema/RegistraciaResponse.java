
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
 *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}UcetAIS"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Predmet"/>
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
    "ucetAIS",
    "predmet"
})
@XmlRootElement(name = "RegistraciaResponse")
public class RegistraciaResponse {

    @XmlElement(name = "UcetAIS", required = true)
    protected UcetAIS ucetAIS;
    @XmlElement(name = "Predmet", required = true)
    protected Predmet predmet;

    /**
     * Gets the value of the ucetAIS property.
     * 
     * @return
     *     possible object is
     *     {@link UcetAIS }
     *     
     */
    public UcetAIS getUcetAIS() {
        return ucetAIS;
    }

    /**
     * Sets the value of the ucetAIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcetAIS }
     *     
     */
    public void setUcetAIS(UcetAIS value) {
        this.ucetAIS = value;
    }

    /**
     * Gets the value of the predmet property.
     * 
     * @return
     *     possible object is
     *     {@link Predmet }
     *     
     */
    public Predmet getPredmet() {
        return predmet;
    }

    /**
     * Sets the value of the predmet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predmet }
     *     
     */
    public void setPredmet(Predmet value) {
        this.predmet = value;
    }

}
