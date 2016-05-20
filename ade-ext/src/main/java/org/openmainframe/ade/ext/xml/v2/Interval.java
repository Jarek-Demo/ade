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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 01:05:44 PM EDT 
//

package org.openmainframe.ade.ext.xml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sys_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="anomaly_score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="model_internal_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ade_version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gmt_offset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model_info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="model_creation_date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="training_period" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="interval_size_in_sec" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="analysis_group" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="limited_model">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Yes"/>
 *                       &lt;enumeration value="No"/>
 *                       &lt;enumeration value="Unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="msg_summary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="num_new_msg" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="interval_message" type="{http://www.openmainframe.org/ade/AdeCoreIntervalV2}interval_message_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "version",
        "sysId",
        "startTime",
        "endTime",
        "anomalyScore",
        "modelInternalId",
        "adeVersion",
        "gmtOffset",
        "modelInfo",
        "msgSummary",
        "intervalMessage"
})
@XmlRootElement(name = "interval", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
public class Interval {

    @XmlElement(namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
    protected int version;
    @XmlElement(name = "sys_id", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    protected String sysId;
    @XmlElement(name = "start_time", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "end_time", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "anomaly_score", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
    protected double anomalyScore;
    @XmlElement(name = "model_internal_id", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
    protected int modelInternalId;
    @XmlElement(name = "ade_version", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
    protected int adeVersion;
    @XmlElement(name = "gmt_offset", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    protected String gmtOffset;
    @XmlElement(name = "model_info", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    protected Interval.ModelInfo modelInfo;
    @XmlElement(name = "msg_summary", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2", required = true)
    protected Interval.MsgSummary msgSummary;
    @XmlElement(name = "interval_message", namespace = "http://www.openmainframe.org/ade/AdeCoreIntervalV2")
    protected List<IntervalMessageType> intervalMessage;

    /**
     * Gets the value of the version property.
     * 
     */
    public final int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public final void setVersion(int value) {
        this.version = value;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public final String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public final void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public final XMLGregorianCalendar getStartTime() {
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
    public final void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public final XMLGregorianCalendar getEndTime() {
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
    public final void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the anomalyScore property.
     * 
     */
    public final double getAnomalyScore() {
        return anomalyScore;
    }

    /**
     * Sets the value of the anomalyScore property.
     * 
     */
    public final void setAnomalyScore(double value) {
        this.anomalyScore = value;
    }

    /**
     * Gets the value of the modelInternalId property.
     * 
     */
    public final int getModelInternalId() {
        return modelInternalId;
    }

    /**
     * Sets the value of the modelInternalId property.
     * 
     */
    public final void setModelInternalId(int value) {
        this.modelInternalId = value;
    }

    /**
     * Gets the value of the adeVersion property.
     * 
     */
    public final int getAdeVersion() {
        return adeVersion;
    }

    /**
     * Sets the value of the adeVersion property.
     * 
     */
    public final void setAdeVersion(int value) {
        this.adeVersion = value;
    }

    /**
     * Gets the value of the gmtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public final String getGmtOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public final void setGmtOffset(String value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the value of the modelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Interval.ModelInfo }
     *     
     */
    public final Interval.ModelInfo getModelInfo() {
        return modelInfo;
    }

    /**
     * Sets the value of the modelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval.ModelInfo }
     *     
     */
    public final void setModelInfo(Interval.ModelInfo value) {
        this.modelInfo = value;
    }

    /**
     * Gets the value of the msgSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Interval.MsgSummary }
     *     
     */
    public final Interval.MsgSummary getMsgSummary() {
        return msgSummary;
    }

    /**
     * Sets the value of the msgSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval.MsgSummary }
     *     
     */
    public final void setMsgSummary(Interval.MsgSummary value) {
        this.msgSummary = value;
    }

    /**
     * Gets the value of the intervalMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalMessageType }
     * 
     * 
     */
    public final List<IntervalMessageType> getIntervalMessage() {
        if (intervalMessage == null) {
            intervalMessage = new ArrayList<>();
        }
        return this.intervalMessage;
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
     *       &lt;attribute name="model_creation_date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="training_period" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="interval_size_in_sec" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="analysis_group" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="limited_model">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Yes"/>
     *             &lt;enumeration value="No"/>
     *             &lt;enumeration value="Unknown"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ModelInfo {

        @XmlAttribute(name = "model_creation_date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modelCreationDate;
        @XmlAttribute(name = "training_period", required = true)
        protected int trainingPeriod;
        @XmlAttribute(name = "interval_size_in_sec", required = true)
        protected long intervalSizeInSec;
        @XmlAttribute(name = "analysis_group", required = true)
        protected String analysisGroup;
        @XmlAttribute(name = "limited_model")
        protected String limitedModel;

        /**
         * Gets the value of the modelCreationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public final XMLGregorianCalendar getModelCreationDate() {
            return modelCreationDate;
        }

        /**
         * Sets the value of the modelCreationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public final void setModelCreationDate(XMLGregorianCalendar value) {
            this.modelCreationDate = value;
        }

        /**
         * Gets the value of the trainingPeriod property.
         * 
         */
        public final int getTrainingPeriod() {
            return trainingPeriod;
        }

        /**
         * Sets the value of the trainingPeriod property.
         * 
         */
        public final void setTrainingPeriod(int value) {
            this.trainingPeriod = value;
        }

        /**
         * Gets the value of the intervalSizeInSec property.
         * 
         */
        public final long getIntervalSizeInSec() {
            return intervalSizeInSec;
        }

        /**
         * Sets the value of the intervalSizeInSec property.
         * 
         */
        public final void setIntervalSizeInSec(long value) {
            this.intervalSizeInSec = value;
        }

        /**
         * Gets the value of the analysisGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public final String getAnalysisGroup() {
            return analysisGroup;
        }

        /**
         * Sets the value of the analysisGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public final void setAnalysisGroup(String value) {
            this.analysisGroup = value;
        }

        /**
         * Gets the value of the limitedModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public final String getLimitedModel() {
            return limitedModel;
        }

        /**
         * Sets the value of the limitedModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public final void setLimitedModel(String value) {
            this.limitedModel = value;
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
     *       &lt;attribute name="num_new_msg" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MsgSummary {

        @XmlAttribute(name = "num_new_msg", required = true)
        protected int numNewMsg;

        /**
         * Gets the value of the numNewMsg property.
         * 
         */
        public final int getNumNewMsg() {
            return numNewMsg;
        }

        /**
         * Sets the value of the numNewMsg property.
         * 
         */
        public final void setNumNewMsg(int value) {
            this.numNewMsg = value;
        }

    }

}
