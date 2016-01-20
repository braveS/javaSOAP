
package org.netbeans.xml.schema.newxmlschema;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="idUctu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Typ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Student"/>
 *         &lt;element name="Heslo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatumExpiracieHesla" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Predmet" maxOccurs="unbounded"/>
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
    "typ",
    "student",
    "heslo",
    "datumExpiracieHesla",
    "predmet"
})
@XmlRootElement(name = "UcetAIS")
public class UcetAIS {

    @XmlElement(required = true)
    protected String idUctu;
    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Student", required = true)
    protected Student student;
    @XmlElement(name = "Heslo", required = true)
    protected String heslo;
    @XmlElement(name = "DatumExpiracieHesla", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumExpiracieHesla;
    @XmlElement(name = "Predmet", required = true)
    protected List<Predmet> predmet;

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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudent(Student value) {
        this.student = value;
    }

    /**
     * Gets the value of the heslo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeslo() {
        return heslo;
    }

    /**
     * Sets the value of the heslo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeslo(String value) {
        this.heslo = value;
    }

    /**
     * Gets the value of the datumExpiracieHesla property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumExpiracieHesla() {
        return datumExpiracieHesla;
    }

    /**
     * Sets the value of the datumExpiracieHesla property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumExpiracieHesla(XMLGregorianCalendar value) {
        this.datumExpiracieHesla = value;
    }

    /**
     * Gets the value of the predmet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predmet }
     * 
     * 
     */
    public List<Predmet> getPredmet() {
        if (predmet == null) {
            predmet = new ArrayList<Predmet>();
        }
        return this.predmet;
    }

}
