package WebService;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import entity.School;

@WebService
public interface SearchUniversityInterface {
	
	@WebMethod
	@WebResult(name="schoolsInSameProvince")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * 搜索在同一个省份的所有学校
	 * @param province 输入的省份
	 * @return  返回学校列表
	 */
	public List<School> searchByProvince(@WebParam(name="province") String province);
	
	@WebMethod
	@WebResult(name="schoolsOfSameType")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * 搜索同一个类别的所有学校
	 * @param type  输入的类别//包括综合，工科，农业……
	 * @return  返回学校列表
	 */
	public List<School> searchBytype(@WebParam(name="type") String type);
	
	@WebMethod
	@WebResult(name="school")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * 搜索对应学校信息
	 * @param name  输入的学校名称
	 * @return  返回对应学校
	 */
	public School searchByName(@WebParam(name="name") String name);
	
	@WebMethod
	@WebResult(name="schoolsOfSameCharacter")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * 搜索相同等级的学校
	 * @param character  学校的等级//包括 本科，专科……
	 * @return 返回学校列表
	 */
	public List<School> searchByCharacter(@WebParam(name="Character") String character);
	
	@WebMethod
	@WebResult(name="schools")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * 获得所有学校
	 * @return  返回所有学校的列表
	 */
	public List<School> getAllSchoolInfo();
	
}
