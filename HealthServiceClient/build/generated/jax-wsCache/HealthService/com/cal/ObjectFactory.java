
package com.cal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cal package. 
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

    private final static QName _GetWaterIntakeStatus_QNAME = new QName("http://health.com/", "getWaterIntakeStatus");
    private final static QName _GetWaterIntakeStatusResponse_QNAME = new QName("http://health.com/", "getWaterIntakeStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWaterIntakeStatus }
     * 
     */
    public GetWaterIntakeStatus createGetWaterIntakeStatus() {
        return new GetWaterIntakeStatus();
    }

    /**
     * Create an instance of {@link GetWaterIntakeStatusResponse }
     * 
     */
    public GetWaterIntakeStatusResponse createGetWaterIntakeStatusResponse() {
        return new GetWaterIntakeStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaterIntakeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://health.com/", name = "getWaterIntakeStatus")
    public JAXBElement<GetWaterIntakeStatus> createGetWaterIntakeStatus(GetWaterIntakeStatus value) {
        return new JAXBElement<GetWaterIntakeStatus>(_GetWaterIntakeStatus_QNAME, GetWaterIntakeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWaterIntakeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://health.com/", name = "getWaterIntakeStatusResponse")
    public JAXBElement<GetWaterIntakeStatusResponse> createGetWaterIntakeStatusResponse(GetWaterIntakeStatusResponse value) {
        return new JAXBElement<GetWaterIntakeStatusResponse>(_GetWaterIntakeStatusResponse_QNAME, GetWaterIntakeStatusResponse.class, null, value);
    }

}
