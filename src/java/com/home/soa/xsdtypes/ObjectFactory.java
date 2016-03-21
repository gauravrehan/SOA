
package com.home.soa.xsdtypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.home.soa.xsdtypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeRequest_QNAME = new QName("http://com.home.soa", "EmployeeRequest");
    private final static QName _EmployeeResponse_QNAME = new QName("http://com.home.soa", "EmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.home.soa.xsdtypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeRequestMessage }
     * 
     */
    public EmployeeRequestMessage createEmployeeRequestMessage() {
        return new EmployeeRequestMessage();
    }

    /**
     * Create an instance of {@link EmployeeResponseMessage }
     * 
     */
    public EmployeeResponseMessage createEmployeeResponseMessage() {
        return new EmployeeResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.home.soa", name = "EmployeeRequest")
    public JAXBElement<EmployeeRequestMessage> createEmployeeRequest(EmployeeRequestMessage value) {
        return new JAXBElement<EmployeeRequestMessage>(_EmployeeRequest_QNAME, EmployeeRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.home.soa", name = "EmployeeResponse")
    public JAXBElement<EmployeeResponseMessage> createEmployeeResponse(EmployeeResponseMessage value) {
        return new JAXBElement<EmployeeResponseMessage>(_EmployeeResponse_QNAME, EmployeeResponseMessage.class, null, value);
    }

}
