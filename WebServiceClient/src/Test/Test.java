package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import helper.ConnectHelper;
import webservice.School;
import webservice.SearchUniversity;

public class Test {
	public static void main(String arge[]) throws MalformedURLException {   
		
		ConnectHelper connectHelper=new ConnectHelper();
		SearchUniversity port=connectHelper.connect();
//		List<School> schools=port.getAllSchoolInfo();
//		for (int i = 0; i < schools.size(); i++) {
//			System.out.println(schools.get(i).getName());
//		}
		
		School school=port.searchByName("������ѧ");
		System.out.println(school.getName()+"  "+school.getProvince()+"  "+school.getType()+"   "+school.getCharacter());
		
		List<School> schoolsInSameProvince=port.searchByProvince("����");
		System.out.println(schoolsInSameProvince.size());
		
		List<School> schoolsOfSameType=port.searchBytype("�ۺ�");
		System.out.println(schoolsOfSameType.size());
		
		List<School>  schoolsOfSameCharacter=port.searchByCharacter("����");
		System.out.println(schoolsOfSameCharacter.size());
		
		
		
	}
}
