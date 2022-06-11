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
	 * ������ͬһ��ʡ�ݵ�����ѧУ
	 * @param province �����ʡ��
	 * @return  ����ѧУ�б�
	 */
	public List<School> searchByProvince(@WebParam(name="province") String province);
	
	@WebMethod
	@WebResult(name="schoolsOfSameType")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * ����ͬһ����������ѧУ
	 * @param type  ��������//�����ۺϣ����ƣ�ũҵ����
	 * @return  ����ѧУ�б�
	 */
	public List<School> searchBytype(@WebParam(name="type") String type);
	
	@WebMethod
	@WebResult(name="school")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * ������ӦѧУ��Ϣ
	 * @param name  �����ѧУ����
	 * @return  ���ض�ӦѧУ
	 */
	public School searchByName(@WebParam(name="name") String name);
	
	@WebMethod
	@WebResult(name="schoolsOfSameCharacter")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * ������ͬ�ȼ���ѧУ
	 * @param character  ѧУ�ĵȼ�//���� ���ƣ�ר�ơ���
	 * @return ����ѧУ�б�
	 */
	public List<School> searchByCharacter(@WebParam(name="Character") String character);
	
	@WebMethod
	@WebResult(name="schools")
	@SOAPBinding(style = SOAPBinding.Style.RPC)
	/**
	 * �������ѧУ
	 * @return  ��������ѧУ���б�
	 */
	public List<School> getAllSchoolInfo();
	
}
