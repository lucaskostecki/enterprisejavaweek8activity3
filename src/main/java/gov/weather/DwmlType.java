
package gov.weather;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for dwmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dwmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latLonList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "dwml")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dwmlType", propOrder = {
    "latLonList"
})
public class DwmlType {

    @XmlElement(required = true)
    protected String latLonList;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the latLonList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatLonList() {
        return latLonList;
    }

    /**
     * Sets the value of the latLonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatLonList(String value) {
        this.latLonList = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
