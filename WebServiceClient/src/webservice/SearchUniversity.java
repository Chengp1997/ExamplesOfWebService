
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchUniversity", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchUniversity {


    /**
     * 
     * @return
     *     returns java.util.List<webservice.School>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSchoolInfo", targetNamespace = "http://WebService/", className = "webservice.GetAllSchoolInfo")
    @ResponseWrapper(localName = "getAllSchoolInfoResponse", targetNamespace = "http://WebService/", className = "webservice.GetAllSchoolInfoResponse")
    @Action(input = "http://WebService/SearchUniversity/getAllSchoolInfoRequest", output = "http://WebService/SearchUniversity/getAllSchoolInfoResponse")
    public List<School> getAllSchoolInfo();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.School>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByCharacter", targetNamespace = "http://WebService/", className = "webservice.SearchByCharacter")
    @ResponseWrapper(localName = "searchByCharacterResponse", targetNamespace = "http://WebService/", className = "webservice.SearchByCharacterResponse")
    @Action(input = "http://WebService/SearchUniversity/searchByCharacterRequest", output = "http://WebService/SearchUniversity/searchByCharacterResponse")
    public List<School> searchByCharacter(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns webservice.School
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByName", targetNamespace = "http://WebService/", className = "webservice.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "http://WebService/", className = "webservice.SearchByNameResponse")
    @Action(input = "http://WebService/SearchUniversity/searchByNameRequest", output = "http://WebService/SearchUniversity/searchByNameResponse")
    public School searchByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.School>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchBytype", targetNamespace = "http://WebService/", className = "webservice.SearchBytype")
    @ResponseWrapper(localName = "searchBytypeResponse", targetNamespace = "http://WebService/", className = "webservice.SearchBytypeResponse")
    @Action(input = "http://WebService/SearchUniversity/searchBytypeRequest", output = "http://WebService/SearchUniversity/searchBytypeResponse")
    public List<School> searchBytype(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<webservice.School>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByProvince", targetNamespace = "http://WebService/", className = "webservice.SearchByProvince")
    @ResponseWrapper(localName = "searchByProvinceResponse", targetNamespace = "http://WebService/", className = "webservice.SearchByProvinceResponse")
    @Action(input = "http://WebService/SearchUniversity/searchByProvinceRequest", output = "http://WebService/SearchUniversity/searchByProvinceResponse")
    public List<School> searchByProvince(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
