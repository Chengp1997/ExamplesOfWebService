
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _SearchByCharacter_QNAME = new QName("http://WebService/", "searchByCharacter");
    private final static QName _GetAllSchoolInfo_QNAME = new QName("http://WebService/", "getAllSchoolInfo");
    private final static QName _SearchBytype_QNAME = new QName("http://WebService/", "searchBytype");
    private final static QName _GetAllSchoolInfoResponse_QNAME = new QName("http://WebService/", "getAllSchoolInfoResponse");
    private final static QName _SearchByNameResponse_QNAME = new QName("http://WebService/", "searchByNameResponse");
    private final static QName _SearchByName_QNAME = new QName("http://WebService/", "searchByName");
    private final static QName _SearchByProvinceResponse_QNAME = new QName("http://WebService/", "searchByProvinceResponse");
    private final static QName _SearchByProvince_QNAME = new QName("http://WebService/", "searchByProvince");
    private final static QName _SearchBytypeResponse_QNAME = new QName("http://WebService/", "searchBytypeResponse");
    private final static QName _SearchByCharacterResponse_QNAME = new QName("http://WebService/", "searchByCharacterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByCharacterResponse }
     * 
     */
    public SearchByCharacterResponse createSearchByCharacterResponse() {
        return new SearchByCharacterResponse();
    }

    /**
     * Create an instance of {@link SearchBytypeResponse }
     * 
     */
    public SearchBytypeResponse createSearchBytypeResponse() {
        return new SearchBytypeResponse();
    }

    /**
     * Create an instance of {@link SearchByProvince }
     * 
     */
    public SearchByProvince createSearchByProvince() {
        return new SearchByProvince();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link SearchByProvinceResponse }
     * 
     */
    public SearchByProvinceResponse createSearchByProvinceResponse() {
        return new SearchByProvinceResponse();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link GetAllSchoolInfoResponse }
     * 
     */
    public GetAllSchoolInfoResponse createGetAllSchoolInfoResponse() {
        return new GetAllSchoolInfoResponse();
    }

    /**
     * Create an instance of {@link GetAllSchoolInfo }
     * 
     */
    public GetAllSchoolInfo createGetAllSchoolInfo() {
        return new GetAllSchoolInfo();
    }

    /**
     * Create an instance of {@link SearchBytype }
     * 
     */
    public SearchBytype createSearchBytype() {
        return new SearchBytype();
    }

    /**
     * Create an instance of {@link SearchByCharacter }
     * 
     */
    public SearchByCharacter createSearchByCharacter() {
        return new SearchByCharacter();
    }

    /**
     * Create an instance of {@link School }
     * 
     */
    public School createSchool() {
        return new School();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByCharacter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByCharacter")
    public JAXBElement<SearchByCharacter> createSearchByCharacter(SearchByCharacter value) {
        return new JAXBElement<SearchByCharacter>(_SearchByCharacter_QNAME, SearchByCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSchoolInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getAllSchoolInfo")
    public JAXBElement<GetAllSchoolInfo> createGetAllSchoolInfo(GetAllSchoolInfo value) {
        return new JAXBElement<GetAllSchoolInfo>(_GetAllSchoolInfo_QNAME, GetAllSchoolInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBytype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchBytype")
    public JAXBElement<SearchBytype> createSearchBytype(SearchBytype value) {
        return new JAXBElement<SearchBytype>(_SearchBytype_QNAME, SearchBytype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSchoolInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getAllSchoolInfoResponse")
    public JAXBElement<GetAllSchoolInfoResponse> createGetAllSchoolInfoResponse(GetAllSchoolInfoResponse value) {
        return new JAXBElement<GetAllSchoolInfoResponse>(_GetAllSchoolInfoResponse_QNAME, GetAllSchoolInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByNameResponse")
    public JAXBElement<SearchByNameResponse> createSearchByNameResponse(SearchByNameResponse value) {
        return new JAXBElement<SearchByNameResponse>(_SearchByNameResponse_QNAME, SearchByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByName")
    public JAXBElement<SearchByName> createSearchByName(SearchByName value) {
        return new JAXBElement<SearchByName>(_SearchByName_QNAME, SearchByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByProvinceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByProvinceResponse")
    public JAXBElement<SearchByProvinceResponse> createSearchByProvinceResponse(SearchByProvinceResponse value) {
        return new JAXBElement<SearchByProvinceResponse>(_SearchByProvinceResponse_QNAME, SearchByProvinceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByProvince }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByProvince")
    public JAXBElement<SearchByProvince> createSearchByProvince(SearchByProvince value) {
        return new JAXBElement<SearchByProvince>(_SearchByProvince_QNAME, SearchByProvince.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBytypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchBytypeResponse")
    public JAXBElement<SearchBytypeResponse> createSearchBytypeResponse(SearchBytypeResponse value) {
        return new JAXBElement<SearchBytypeResponse>(_SearchBytypeResponse_QNAME, SearchBytypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByCharacterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "searchByCharacterResponse")
    public JAXBElement<SearchByCharacterResponse> createSearchByCharacterResponse(SearchByCharacterResponse value) {
        return new JAXBElement<SearchByCharacterResponse>(_SearchByCharacterResponse_QNAME, SearchByCharacterResponse.class, null, value);
    }

}
