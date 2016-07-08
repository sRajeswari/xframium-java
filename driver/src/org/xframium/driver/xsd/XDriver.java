//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.08 at 04:49:29 PM EDT 
//


package org.xframium.driver.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xDriver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="property" type="{http://www.xframium.org/xFramiumDriver}xProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="propertyAdapter" type="{http://www.xframium.org/xFramiumDriver}xPropertyAdapter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="artifact" type="{http://www.xframium.org/xFramiumDriver}xArtifact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="library" type="{http://www.xframium.org/xFramiumDriver}xLibrary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="APPIUM"/&gt;
 *             &lt;enumeration value="WEB"/&gt;
 *             &lt;enumeration value="PERFECTO"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="personas" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cachingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="stepTags" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="testNames" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tagNames" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dryRun" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="displayResults" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="outputFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xDriver", propOrder = {
    "property",
    "propertyAdapter",
    "artifact",
    "library"
})
public class XDriver {

    protected List<XProperty> property;
    protected List<XPropertyAdapter> propertyAdapter;
    protected List<XArtifact> artifact;
    protected List<XLibrary> library;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "personas")
    protected String personas;
    @XmlAttribute(name = "cachingEnabled")
    protected Boolean cachingEnabled;
    @XmlAttribute(name = "stepTags")
    protected String stepTags;
    @XmlAttribute(name = "testNames")
    protected String testNames;
    @XmlAttribute(name = "tagNames")
    protected String tagNames;
    @XmlAttribute(name = "dryRun")
    protected Boolean dryRun;
    @XmlAttribute(name = "displayResults")
    protected Boolean displayResults;
    @XmlAttribute(name = "outputFolder", required = true)
    protected String outputFolder;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XProperty }
     * 
     * 
     */
    public List<XProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<XProperty>();
        }
        return this.property;
    }

    /**
     * Gets the value of the propertyAdapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAdapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPropertyAdapter }
     * 
     * 
     */
    public List<XPropertyAdapter> getPropertyAdapter() {
        if (propertyAdapter == null) {
            propertyAdapter = new ArrayList<XPropertyAdapter>();
        }
        return this.propertyAdapter;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XArtifact }
     * 
     * 
     */
    public List<XArtifact> getArtifact() {
        if (artifact == null) {
            artifact = new ArrayList<XArtifact>();
        }
        return this.artifact;
    }

    /**
     * Gets the value of the library property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the library property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XLibrary }
     * 
     * 
     */
    public List<XLibrary> getLibrary() {
        if (library == null) {
            library = new ArrayList<XLibrary>();
        }
        return this.library;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the personas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonas() {
        return personas;
    }

    /**
     * Sets the value of the personas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonas(String value) {
        this.personas = value;
    }

    /**
     * Gets the value of the cachingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCachingEnabled() {
        if (cachingEnabled == null) {
            return false;
        } else {
            return cachingEnabled;
        }
    }

    /**
     * Sets the value of the cachingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCachingEnabled(Boolean value) {
        this.cachingEnabled = value;
    }

    /**
     * Gets the value of the stepTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepTags() {
        return stepTags;
    }

    /**
     * Sets the value of the stepTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepTags(String value) {
        this.stepTags = value;
    }

    /**
     * Gets the value of the testNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestNames() {
        return testNames;
    }

    /**
     * Sets the value of the testNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestNames(String value) {
        this.testNames = value;
    }

    /**
     * Gets the value of the tagNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagNames() {
        return tagNames;
    }

    /**
     * Sets the value of the tagNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagNames(String value) {
        this.tagNames = value;
    }

    /**
     * Gets the value of the dryRun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDryRun() {
        if (dryRun == null) {
            return false;
        } else {
            return dryRun;
        }
    }

    /**
     * Sets the value of the dryRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDryRun(Boolean value) {
        this.dryRun = value;
    }

    /**
     * Gets the value of the displayResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplayResults() {
        if (displayResults == null) {
            return true;
        } else {
            return displayResults;
        }
    }

    /**
     * Sets the value of the displayResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayResults(Boolean value) {
        this.displayResults = value;
    }

    /**
     * Gets the value of the outputFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFolder() {
        return outputFolder;
    }

    /**
     * Sets the value of the outputFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFolder(String value) {
        this.outputFolder = value;
    }

}
