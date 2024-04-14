
package lt.viko.eif.asinkevic.xsdtest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object provides factory methods for each Java content interface and
 * Java element interface generated in the lt.viko.eif.asinkevic.xsdtest
 * package. An ObjectFactory allows you to programmatically construct
 * new instances of the Java representation for XML content. The Java
 * representation of XML content can consist of schema-derived interfaces
 * and classes representing the binding of schema type definitions, element
 * declarations, and model groups. Factory methods for each of these are
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _FirstName_QNAME = new QName("", "FirstName");
    private final static QName _Lastname_QNAME = new QName("", "Lastname");
    private final static QName _PhoneNumber_QNAME = new QName("", "telefonoNumeris");
    private final static QName _Address_QNAME = new QName("", "adresas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.asinkevic.xsdtest
     *
     */
    public ObjectFactory() {
    }
    /**
     * Create an instance of {@link Uzsakovas }
     *
     */
    public Uzsakovas createUzsakovas() {
        return new Uzsakovas();
    }
    /**
     * Create an instance of {@link Vairuotojas }
     *
     */
    public Vairuotojas createVairuotojas() {
        return new Vairuotojas();
    }
    /**
     * Create an instance of {@link Autobusas }
     *
     */
    public Autobusas createAutobusas() {
        return new Autobusas();
    }
    /**
     * Create an instance of {@link Reisas }
     *
     */
    public Reisas createReisas() {
        return new Reisas();
    }
    /**
     * Create an instance of {@link ReisasList }
     *
     */
    public ReisasList createReisasList() {
        return new ReisasList();
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Lastname")
    public JAXBElement<String> createLastname(String value) {
        return new JAXBElement<String>(_Lastname_QNAME, String.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "telefonoNumeris")
    public JAXBElement<String> createPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneNumber_QNAME, String.class, null, value);
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "adresas")
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }
}
