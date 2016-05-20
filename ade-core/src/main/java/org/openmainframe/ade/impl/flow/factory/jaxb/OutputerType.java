/*
 
    Copyright IBM Corp. 2012, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.06 at 05:15:48 PM IDT 
//

package org.openmainframe.ade.impl.flow.factory.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for OutputerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputerClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutputerProperty" type="{http://flow.impl.ade.openmainframe.org/factory}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkedScorer" type="{http://flow.impl.ade.openmainframe.org/factory}LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrainingFramingFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputerType", namespace = "http://flow.impl.ade.openmainframe.org/factory", propOrder = {
        "outputerClass",
        "outputerProperty",
        "linkedScorer",
        "trainingFramingFlow"
})
public class OutputerType {

    @XmlElement(name = "OutputerClass", required = true)
    protected String outputerClass;
    @XmlElement(name = "OutputerProperty")
    protected List<PropertyType> outputerProperty;
    @XmlElement(name = "LinkedScorer")
    protected List<LinkType> linkedScorer;
    @XmlElement(name = "TrainingFramingFlow")
    protected String trainingFramingFlow;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the outputerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputerClass() {
        return outputerClass;
    }

    /**
     * Sets the value of the outputerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputerClass(String value) {
        this.outputerClass = value;
    }

    /**
     * Gets the value of the outputerProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputerProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputerProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getOutputerProperty() {
        if (outputerProperty == null) {
            outputerProperty = new ArrayList<>();
        }
        return this.outputerProperty;
    }

    /**
     * Gets the value of the linkedScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkType }
     * 
     * 
     */
    public List<LinkType> getLinkedScorer() {
        if (linkedScorer == null) {
            linkedScorer = new ArrayList<>();
        }
        return this.linkedScorer;
    }

    /**
     * Gets the value of the trainingFramingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingFramingFlow() {
        return trainingFramingFlow;
    }

    /**
     * Sets the value of the trainingFramingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingFramingFlow(String value) {
        this.trainingFramingFlow = value;
    }

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

}
