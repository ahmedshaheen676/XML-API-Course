//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.18 at 04:34:43 PM EET 
//


package com.shaheen.message;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for message complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="messageContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="style" type="{}style"/>
 *         &lt;element name="userFrom" type="{}User"/>
 *         &lt;element name="chatGroup" type="{}ChatGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", propOrder = {
        "id",
        "messageContent",
        "style",
        "userFrom",
        "chatGroup"
})
public class Message {

    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlElement(required = true)
    protected String messageContent;
    @XmlElement(required = true)
    protected Style style;
    @XmlElement(required = true)
    protected User userFrom;
    @XmlElement(required = true)
    protected ChatGroup chatGroup;

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the messageContent property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * Sets the value of the messageContent property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessageContent(String value) {
        this.messageContent = value;
    }

    /**
     * Gets the value of the style property.
     *
     * @return possible object is
     * {@link Style }
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value allowed object is
     *              {@link Style }
     */
    public void setStyle(Style value) {
        this.style = value;
    }

    /**
     * Gets the value of the userFrom property.
     *
     * @return possible object is
     * {@link User }
     */
    public User getUserFrom() {
        return userFrom;
    }

    /**
     * Sets the value of the userFrom property.
     *
     * @param value allowed object is
     *              {@link User }
     */
    public void setUserFrom(User value) {
        this.userFrom = value;
    }

    /**
     * Gets the value of the chatGroup property.
     *
     * @return possible object is
     * {@link ChatGroup }
     */
    public ChatGroup getChatGroup() {
        return chatGroup;
    }

    /**
     * Sets the value of the chatGroup property.
     *
     * @param value allowed object is
     *              {@link ChatGroup }
     */
    public void setChatGroup(ChatGroup value) {
        this.chatGroup = value;
    }

}
