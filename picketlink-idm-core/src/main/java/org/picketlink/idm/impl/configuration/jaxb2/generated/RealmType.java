//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.18 at 03:00:04 PM CET 
//


package org.picketlink.idm.impl.configuration.jaxb2.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realmType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realmType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repository-id-ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity-type-mappings" type="{urn:picketlink:idm:config:v1_0_0_ga}identity-type-mappingsType" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:picketlink:idm:config:v1_0_0_ga}optionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realmType", propOrder = {
    "id",
    "repositoryIdRef",
    "identityTypeMappings",
    "options"
})
public class RealmType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "repository-id-ref", required = true)
    protected String repositoryIdRef;
    @XmlElement(name = "identity-type-mappings")
    protected IdentityTypeMappingsType identityTypeMappings;
    protected OptionsType options;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the repositoryIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryIdRef() {
        return repositoryIdRef;
    }

    /**
     * Sets the value of the repositoryIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryIdRef(String value) {
        this.repositoryIdRef = value;
    }

    /**
     * Gets the value of the identityTypeMappings property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityTypeMappingsType }
     *     
     */
    public IdentityTypeMappingsType getIdentityTypeMappings() {
        return identityTypeMappings;
    }

    /**
     * Sets the value of the identityTypeMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityTypeMappingsType }
     *     
     */
    public void setIdentityTypeMappings(IdentityTypeMappingsType value) {
        this.identityTypeMappings = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

}
