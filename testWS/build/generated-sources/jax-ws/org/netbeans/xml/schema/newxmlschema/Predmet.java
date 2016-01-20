
package org.netbeans.xml.schema.newxmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="idPredmetu" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="Nazov">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Odbor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PocetKreditov" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zaciatok" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CasPrednasok">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiestnostPrednasok">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MiestnostCviceni">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Prednasajuci">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Ucitel"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cviciaci">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Ucitel" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "idPredmetu",
    "nazov",
    "odbor",
    "pocetKreditov",
    "zaciatok",
    "casPrednasok",
    "miestnostPrednasok",
    "miestnostCviceni",
    "prednasajuci",
    "cviciaci"
})
@XmlRootElement(name = "Predmet")
public class Predmet {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idPredmetu;
    @XmlElement(name = "Nazov", required = true)
    protected String nazov;
    @XmlElement(name = "Odbor", required = true)
    protected String odbor;
    @XmlElement(name = "PocetKreditov")
    protected int pocetKreditov;
    @XmlElement(name = "Zaciatok", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zaciatok;
    @XmlElement(name = "CasPrednasok", required = true)
    protected String casPrednasok;
    @XmlElement(name = "MiestnostPrednasok", required = true)
    protected String miestnostPrednasok;
    @XmlElement(name = "MiestnostCviceni", required = true)
    protected String miestnostCviceni;
    @XmlElement(name = "Prednasajuci", required = true)
    protected Predmet.Prednasajuci prednasajuci;
    @XmlElement(name = "Cviciaci", required = true)
    protected Predmet.Cviciaci cviciaci;

    /**
     * Gets the value of the idPredmetu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPredmetu() {
        return idPredmetu;
    }

    /**
     * Sets the value of the idPredmetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPredmetu(String value) {
        this.idPredmetu = value;
    }

    /**
     * Gets the value of the nazov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazov() {
        return nazov;
    }

    /**
     * Sets the value of the nazov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazov(String value) {
        this.nazov = value;
    }

    /**
     * Gets the value of the odbor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdbor() {
        return odbor;
    }

    /**
     * Sets the value of the odbor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdbor(String value) {
        this.odbor = value;
    }

    /**
     * Gets the value of the pocetKreditov property.
     * 
     */
    public int getPocetKreditov() {
        return pocetKreditov;
    }

    /**
     * Sets the value of the pocetKreditov property.
     * 
     */
    public void setPocetKreditov(int value) {
        this.pocetKreditov = value;
    }

    /**
     * Gets the value of the zaciatok property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZaciatok() {
        return zaciatok;
    }

    /**
     * Sets the value of the zaciatok property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZaciatok(XMLGregorianCalendar value) {
        this.zaciatok = value;
    }

    /**
     * Gets the value of the casPrednasok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasPrednasok() {
        return casPrednasok;
    }

    /**
     * Sets the value of the casPrednasok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasPrednasok(String value) {
        this.casPrednasok = value;
    }

    /**
     * Gets the value of the miestnostPrednasok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiestnostPrednasok() {
        return miestnostPrednasok;
    }

    /**
     * Sets the value of the miestnostPrednasok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiestnostPrednasok(String value) {
        this.miestnostPrednasok = value;
    }

    /**
     * Gets the value of the miestnostCviceni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiestnostCviceni() {
        return miestnostCviceni;
    }

    /**
     * Sets the value of the miestnostCviceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiestnostCviceni(String value) {
        this.miestnostCviceni = value;
    }

    /**
     * Gets the value of the prednasajuci property.
     * 
     * @return
     *     possible object is
     *     {@link Predmet.Prednasajuci }
     *     
     */
    public Predmet.Prednasajuci getPrednasajuci() {
        return prednasajuci;
    }

    /**
     * Sets the value of the prednasajuci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predmet.Prednasajuci }
     *     
     */
    public void setPrednasajuci(Predmet.Prednasajuci value) {
        this.prednasajuci = value;
    }

    /**
     * Gets the value of the cviciaci property.
     * 
     * @return
     *     possible object is
     *     {@link Predmet.Cviciaci }
     *     
     */
    public Predmet.Cviciaci getCviciaci() {
        return cviciaci;
    }

    /**
     * Sets the value of the cviciaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predmet.Cviciaci }
     *     
     */
    public void setCviciaci(Predmet.Cviciaci value) {
        this.cviciaci = value;
    }


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
     *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Ucitel" maxOccurs="unbounded"/>
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
        "ucitel"
    })
    public static class Cviciaci {

        @XmlElement(name = "Ucitel", required = true)
        protected List<Ucitel> ucitel;

        /**
         * Gets the value of the ucitel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ucitel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUcitel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ucitel }
         * 
         * 
         */
        public List<Ucitel> getUcitel() {
            if (ucitel == null) {
                ucitel = new ArrayList<Ucitel>();
            }
            return this.ucitel;
        }

    }


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
     *         &lt;element ref="{http://xml.netbeans.org/schema/newXmlSchema}Ucitel"/>
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
        "ucitel"
    })
    public static class Prednasajuci {

        @XmlElement(name = "Ucitel", required = true)
        protected Ucitel ucitel;

        /**
         * Gets the value of the ucitel property.
         * 
         * @return
         *     possible object is
         *     {@link Ucitel }
         *     
         */
        public Ucitel getUcitel() {
            return ucitel;
        }

        /**
         * Sets the value of the ucitel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ucitel }
         *     
         */
        public void setUcitel(Ucitel value) {
            this.ucitel = value;
        }

    }

}
