//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.27 at 11:36:21 AM CEST 
//


package pl.stalostech.autogenerated.xsd.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logoColor" type="{http://stalostech.pl/autogenerated/xsd/model}color"/>
 *         &lt;element name="fps" type="{http://stalostech.pl/autogenerated/xsd/model}int-5-45"/>
 *         &lt;element name="threshold" type="{http://stalostech.pl/autogenerated/xsd/model}int-5-20"/>
 *         &lt;element name="thresholdChecked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="model" type="{http://stalostech.pl/autogenerated/xsd/model}model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
    "logoColor",
    "fps",
    "threshold",
    "thresholdChecked",
    "model"
})
public class Configuration {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logoColor;
    protected int fps;
    protected int threshold;
    protected boolean thresholdChecked;
    @XmlElement(required = true)
    protected Model model;

    /**
     * Gets the value of the logoColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoColor() {
        return logoColor;
    }

    /**
     * Sets the value of the logoColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoColor(String value) {
        this.logoColor = value;
    }

    /**
     * Gets the value of the fps property.
     * 
     */
    public int getFps() {
        return fps;
    }

    /**
     * Sets the value of the fps property.
     * 
     */
    public void setFps(int value) {
        this.fps = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the thresholdChecked property.
     * 
     */
    public boolean isThresholdChecked() {
        return thresholdChecked;
    }

    /**
     * Sets the value of the thresholdChecked property.
     * 
     */
    public void setThresholdChecked(boolean value) {
        this.thresholdChecked = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Model }
     *     
     */
    public Model getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model }
     *     
     */
    public void setModel(Model value) {
        this.model = value;
    }

}