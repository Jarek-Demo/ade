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
// Generated on: 2013.03.21 at 10:03:48 AM IST 
//

package org.openmainframe.ade.impl.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for AnalyzedIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyzedIntervalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartTimeUnix" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTimeUnix" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AnomalyScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ModelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdeVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AnalyzedMessageSummary" type="{}AnalyzedMessageSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScoreSet" type="{}ScoreSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyzedIntervalType", propOrder = {
        "source",
        "startTime",
        "startTimeUnix",
        "endTime",
        "endTimeUnix",
        "anomalyScore",
        "modelId",
        "adeVersion",
        "analyzedMessageSummary",
        "scoreSet"
})
public class AnalyzedIntervalType {

    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "StartTimeUnix")
    protected long startTimeUnix;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "EndTimeUnix")
    protected long endTimeUnix;
    @XmlElement(name = "AnomalyScore")
    protected double anomalyScore;
    @XmlElement(name = "ModelId")
    protected int modelId;
    @XmlElement(name = "AdeVersion")
    protected int adeVersion;
    @XmlElement(name = "AnalyzedMessageSummary")
    protected List<AnalyzedMessageSummaryType> analyzedMessageSummary;
    @XmlElement(name = "ScoreSet")
    protected ScoreSetType scoreSet;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startTimeUnix property.
     * 
     */
    public long getStartTimeUnix() {
        return startTimeUnix;
    }

    /**
     * Sets the value of the startTimeUnix property.
     * 
     */
    public void setStartTimeUnix(long value) {
        this.startTimeUnix = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endTimeUnix property.
     * 
     */
    public long getEndTimeUnix() {
        return endTimeUnix;
    }

    /**
     * Sets the value of the endTimeUnix property.
     * 
     */
    public void setEndTimeUnix(long value) {
        this.endTimeUnix = value;
    }

    /**
     * Gets the value of the anomalyScore property.
     * 
     */
    public double getAnomalyScore() {
        return anomalyScore;
    }

    /**
     * Sets the value of the anomalyScore property.
     * 
     */
    public void setAnomalyScore(double value) {
        this.anomalyScore = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(int value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the adeVersion property.
     * 
     */
    public int getAdeVersion() {
        return adeVersion;
    }

    /**
     * Sets the value of the adeVersion property.
     * 
     */
    public void setAdeVersion(int value) {
        this.adeVersion = value;
    }

    /**
     * Gets the value of the analyzedMessageSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analyzedMessageSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalyzedMessageSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalyzedMessageSummaryType }
     * 
     * 
     */
    public List<AnalyzedMessageSummaryType> getAnalyzedMessageSummary() {
        if (analyzedMessageSummary == null) {
            analyzedMessageSummary = new ArrayList<>();
        }
        return this.analyzedMessageSummary;
    }

    /**
     * Gets the value of the scoreSet property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreSetType }
     *     
     */
    public ScoreSetType getScoreSet() {
        return scoreSet;
    }

    /**
     * Sets the value of the scoreSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreSetType }
     *     
     */
    public void setScoreSet(ScoreSetType value) {
        this.scoreSet = value;
    }

}
