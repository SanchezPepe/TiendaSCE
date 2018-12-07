
package web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web package. 
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

    private final static QName _Hello_QNAME = new QName("http://web/", "hello");
    private final static QName _AltaNoticia_QNAME = new QName("http://web/", "altaNoticia");
    private final static QName _AltaNoticiaResponse_QNAME = new QName("http://web/", "altaNoticiaResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://web/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AltaNoticia }
     * 
     */
    public AltaNoticia createAltaNoticia() {
        return new AltaNoticia();
    }

    /**
     * Create an instance of {@link AltaNoticiaResponse }
     * 
     */
    public AltaNoticiaResponse createAltaNoticiaResponse() {
        return new AltaNoticiaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaNoticia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "altaNoticia")
    public JAXBElement<AltaNoticia> createAltaNoticia(AltaNoticia value) {
        return new JAXBElement<AltaNoticia>(_AltaNoticia_QNAME, AltaNoticia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaNoticiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "altaNoticiaResponse")
    public JAXBElement<AltaNoticiaResponse> createAltaNoticiaResponse(AltaNoticiaResponse value) {
        return new JAXBElement<AltaNoticiaResponse>(_AltaNoticiaResponse_QNAME, AltaNoticiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
