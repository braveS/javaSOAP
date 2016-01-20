
package org.netbeans.xml.schema.newxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OsobneCislo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Meno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Priezvisko">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatumNarodenia" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Email">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Adresa"/>
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
    "osobneCislo",
    "meno",
    "priezvisko",
    "datumNarodenia",
    "email",
    "adresa"
})
@XmlRootElement(name = "Student")
public class Student {

    @XmlElement(name = "OsobneCislo", required = true)
    protected String osobneCislo;
    @XmlElement(name = "Meno", required = true)
    protected String meno;
    @XmlElement(name = "Priezvisko", required = true)
    protected String priezvisko;
    @XmlElement(name = "DatumNarodenia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarodenia;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Adresa", required = true)
    protected Adresa adresa;

    /**
     * Gets the value of the osobneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsobneCislo() {
        return osobneCislo;
    }

    /**
     * Sets the value of the osobneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsobneCislo(String value) {
        this.osobneCislo = value;
    }

    /**
     * Gets the value of the meno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeno() {
        return meno;
    }

    /**
     * Sets the value of the meno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeno(String value) {
        this.meno = value;
    }

    /**
     * Gets the value of the priezvisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriezvisko() {
        return priezvisko;
    }

    /**
     * Sets the value of the priezvisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriezvisko(String value) {
        this.priezvisko = value;
    }

    /**
     * Gets the value of the datumNarodenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNarodenia() {
        return datumNarodenia;
    }

    /**
     * Sets the value of the datumNarodenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNarodenia(XMLGregorianCalendar value) {
        this.datumNarodenia = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setAdresa(Adresa value) {
        this.adresa = value;
    }

}
