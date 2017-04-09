
package e_bank_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the e_bank_ws package. 
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

    private final static QName _DeleteClient_QNAME = new QName("http://E_Bank_ws/", "deleteClient");
    private final static QName _DisplayClientList_QNAME = new QName("http://E_Bank_ws/", "displayClientList");
    private final static QName _LoadClient_QNAME = new QName("http://E_Bank_ws/", "loadClient");
    private final static QName _EditClientResponse_QNAME = new QName("http://E_Bank_ws/", "editClientResponse");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://E_Bank_ws/", "deleteClientResponse");
    private final static QName _DisplayClientListResponse_QNAME = new QName("http://E_Bank_ws/", "displayClientListResponse");
    private final static QName _RegisterClient_QNAME = new QName("http://E_Bank_ws/", "registerClient");
    private final static QName _EditClient_QNAME = new QName("http://E_Bank_ws/", "editClient");
    private final static QName _LoadClientResponse_QNAME = new QName("http://E_Bank_ws/", "loadClientResponse");
    private final static QName _RegisterClientResponse_QNAME = new QName("http://E_Bank_ws/", "registerClientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: e_bank_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayClientList }
     * 
     */
    public DisplayClientList createDisplayClientList() {
        return new DisplayClientList();
    }

    /**
     * Create an instance of {@link LoadClient }
     * 
     */
    public LoadClient createLoadClient() {
        return new LoadClient();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link EditClientResponse }
     * 
     */
    public EditClientResponse createEditClientResponse() {
        return new EditClientResponse();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link LoadClientResponse }
     * 
     */
    public LoadClientResponse createLoadClientResponse() {
        return new LoadClientResponse();
    }

    /**
     * Create an instance of {@link RegisterClientResponse }
     * 
     */
    public RegisterClientResponse createRegisterClientResponse() {
        return new RegisterClientResponse();
    }

    /**
     * Create an instance of {@link DisplayClientListResponse }
     * 
     */
    public DisplayClientListResponse createDisplayClientListResponse() {
        return new DisplayClientListResponse();
    }

    /**
     * Create an instance of {@link EditClient }
     * 
     */
    public EditClient createEditClient() {
        return new EditClient();
    }

    /**
     * Create an instance of {@link RegisterClient }
     * 
     */
    public RegisterClient createRegisterClient() {
        return new RegisterClient();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayClientList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "displayClientList")
    public JAXBElement<DisplayClientList> createDisplayClientList(DisplayClientList value) {
        return new JAXBElement<DisplayClientList>(_DisplayClientList_QNAME, DisplayClientList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loadClient")
    public JAXBElement<LoadClient> createLoadClient(LoadClient value) {
        return new JAXBElement<LoadClient>(_LoadClient_QNAME, LoadClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "editClientResponse")
    public JAXBElement<EditClientResponse> createEditClientResponse(EditClientResponse value) {
        return new JAXBElement<EditClientResponse>(_EditClientResponse_QNAME, EditClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayClientListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "displayClientListResponse")
    public JAXBElement<DisplayClientListResponse> createDisplayClientListResponse(DisplayClientListResponse value) {
        return new JAXBElement<DisplayClientListResponse>(_DisplayClientListResponse_QNAME, DisplayClientListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "registerClient")
    public JAXBElement<RegisterClient> createRegisterClient(RegisterClient value) {
        return new JAXBElement<RegisterClient>(_RegisterClient_QNAME, RegisterClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "editClient")
    public JAXBElement<EditClient> createEditClient(EditClient value) {
        return new JAXBElement<EditClient>(_EditClient_QNAME, EditClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loadClientResponse")
    public JAXBElement<LoadClientResponse> createLoadClientResponse(LoadClientResponse value) {
        return new JAXBElement<LoadClientResponse>(_LoadClientResponse_QNAME, LoadClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "registerClientResponse")
    public JAXBElement<RegisterClientResponse> createRegisterClientResponse(RegisterClientResponse value) {
        return new JAXBElement<RegisterClientResponse>(_RegisterClientResponse_QNAME, RegisterClientResponse.class, null, value);
    }

}
