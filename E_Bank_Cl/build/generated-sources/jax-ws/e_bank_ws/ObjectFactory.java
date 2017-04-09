
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

    private final static QName _EditEmployeeResponse_QNAME = new QName("http://E_Bank_ws/", "editEmployeeResponse");
    private final static QName _DisplayEmployeeList_QNAME = new QName("http://E_Bank_ws/", "displayEmployeeList");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://E_Bank_ws/", "deleteEmployeeResponse");
    private final static QName _DisplayEmployeeListResponse_QNAME = new QName("http://E_Bank_ws/", "displayEmployeeListResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://E_Bank_ws/", "editEmployee");
    private final static QName _LoadEmployee_QNAME = new QName("http://E_Bank_ws/", "loadEmployee");
    private final static QName _LoginEmployee_QNAME = new QName("http://E_Bank_ws/", "loginEmployee");
    private final static QName _LoginEmployeeResponse_QNAME = new QName("http://E_Bank_ws/", "loginEmployeeResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://E_Bank_ws/", "deleteEmployee");
    private final static QName _RegisterEmployeeResponse_QNAME = new QName("http://E_Bank_ws/", "registerEmployeeResponse");
    private final static QName _RegisterEmployee_QNAME = new QName("http://E_Bank_ws/", "registerEmployee");
    private final static QName _LoadEmployeeResponse_QNAME = new QName("http://E_Bank_ws/", "loadEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: e_bank_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayEmployeeList }
     * 
     */
    public DisplayEmployeeList createDisplayEmployeeList() {
        return new DisplayEmployeeList();
    }

    /**
     * Create an instance of {@link LoginEmployee }
     * 
     */
    public LoginEmployee createLoginEmployee() {
        return new LoginEmployee();
    }

    /**
     * Create an instance of {@link LoginEmployeeResponse }
     * 
     */
    public LoginEmployeeResponse createLoginEmployeeResponse() {
        return new LoginEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link DisplayEmployeeListResponse }
     * 
     */
    public DisplayEmployeeListResponse createDisplayEmployeeListResponse() {
        return new DisplayEmployeeListResponse();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link LoadEmployee }
     * 
     */
    public LoadEmployee createLoadEmployee() {
        return new LoadEmployee();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link LoadEmployeeResponse }
     * 
     */
    public LoadEmployeeResponse createLoadEmployeeResponse() {
        return new LoadEmployeeResponse();
    }

    /**
     * Create an instance of {@link RegisterEmployeeResponse }
     * 
     */
    public RegisterEmployeeResponse createRegisterEmployeeResponse() {
        return new RegisterEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link RegisterEmployee }
     * 
     */
    public RegisterEmployee createRegisterEmployee() {
        return new RegisterEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayEmployeeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "displayEmployeeList")
    public JAXBElement<DisplayEmployeeList> createDisplayEmployeeList(DisplayEmployeeList value) {
        return new JAXBElement<DisplayEmployeeList>(_DisplayEmployeeList_QNAME, DisplayEmployeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayEmployeeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "displayEmployeeListResponse")
    public JAXBElement<DisplayEmployeeListResponse> createDisplayEmployeeListResponse(DisplayEmployeeListResponse value) {
        return new JAXBElement<DisplayEmployeeListResponse>(_DisplayEmployeeListResponse_QNAME, DisplayEmployeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loadEmployee")
    public JAXBElement<LoadEmployee> createLoadEmployee(LoadEmployee value) {
        return new JAXBElement<LoadEmployee>(_LoadEmployee_QNAME, LoadEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loginEmployee")
    public JAXBElement<LoginEmployee> createLoginEmployee(LoginEmployee value) {
        return new JAXBElement<LoginEmployee>(_LoginEmployee_QNAME, LoginEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loginEmployeeResponse")
    public JAXBElement<LoginEmployeeResponse> createLoginEmployeeResponse(LoginEmployeeResponse value) {
        return new JAXBElement<LoginEmployeeResponse>(_LoginEmployeeResponse_QNAME, LoginEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "registerEmployeeResponse")
    public JAXBElement<RegisterEmployeeResponse> createRegisterEmployeeResponse(RegisterEmployeeResponse value) {
        return new JAXBElement<RegisterEmployeeResponse>(_RegisterEmployeeResponse_QNAME, RegisterEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "registerEmployee")
    public JAXBElement<RegisterEmployee> createRegisterEmployee(RegisterEmployee value) {
        return new JAXBElement<RegisterEmployee>(_RegisterEmployee_QNAME, RegisterEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://E_Bank_ws/", name = "loadEmployeeResponse")
    public JAXBElement<LoadEmployeeResponse> createLoadEmployeeResponse(LoadEmployeeResponse value) {
        return new JAXBElement<LoadEmployeeResponse>(_LoadEmployeeResponse_QNAME, LoadEmployeeResponse.class, null, value);
    }

}
