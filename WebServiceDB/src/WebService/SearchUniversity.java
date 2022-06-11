package WebService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import entity.School;

@WebService
public class SearchUniversity implements SearchUniversityInterface {

//	private static String url = "src/resource/schools.xml";
	private static String url = "src/resource/schoolsInChina.xml";

	@Override
	public List<School> getAllSchoolInfo() {
		ArrayList<School> schools = new ArrayList<School>();
		File f = new File(url);
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(f);
			Element foo = doc.getRootElement();
			List<Element> allChildren = foo.getChildren();
			for (int i = 0; i < allChildren.size(); i++) {
				School school = new School();
				if (((Element) allChildren.get(i)).getChild("name") != null) {
					String name = ((Element) allChildren.get(i)).getChild("name").getText();
					school.setName(name);
					System.out.print("name:" + name);
				}
				if (((Element) allChildren.get(i)).getChild("province") != null) {
					String province = ((Element) allChildren.get(i)).getChild("province").getText();
					school.setProvince(province);
					System.out.print("province:" + province);
				}
				if (((Element) allChildren.get(i)).getChild("type") != null) {
					String type = ((Element) allChildren.get(i)).getChild("type").getText();
					school.setType(type);
					System.out.print("type:" + type);
				}
				if (((Element) allChildren.get(i)).getChild("character") != null) {
					String character = ((Element) allChildren.get(i)).getChild("character").getText();
					school.setCharacter(character);
					System.out.print("character:" + character);
				}
				if (((Element) allChildren.get(i)).getChild("type211") != null) {
					String type211 = ((Element) allChildren.get(i)).getChild("type211").getText();
					school.setType211(type211);
					System.out.print("type211:" + type211);
				}
				if (((Element) allChildren.get(i)).getChild("type985") != null) {
					String type985 = ((Element) allChildren.get(i)).getChild("type985").getText();
					school.setType985(type985);
					System.out.print("type985:" + type985);
				}
				if (((Element) allChildren.get(i)).getChild("city") != null) {
					String city = ((Element) allChildren.get(i)).getChild("city").getText();
					school.setCity(city);
					System.out.print("city:" + city);
				}
				if (((Element) allChildren.get(i)).getChild("abbreviation") != null) {
					String abbreviation = ((Element) allChildren.get(i)).getChild("abbreviation").getText();
					school.setAbbreviation(abbreviation);;
					System.out.print("abbreviation:" + abbreviation);
				}
				if (((Element) allChildren.get(i)).getChild("website") != null) {
					String website = ((Element) allChildren.get(i)).getChild("website").getText();
					school.setWebsite(website);;
					System.out.print("website:" + website);
				}
				schools.add(school);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return schools;
	}

	@Override
	public List<School> searchByProvince(String province) {
		System.out.println("from client.." + province);
		ArrayList<School> schoolsInSameProvince = new ArrayList<School>();

		List<School> schools = getAllSchoolInfo();
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getProvince().equals(province)) {
				schoolsInSameProvince.add(schools.get(i));
			}
		}

		return schoolsInSameProvince;
	}

	@Override
	public List<School> searchBytype(String type) {
		System.out.println("from client.." + type);
		ArrayList<School> schoolsOfSameType = new ArrayList<School>();

		List<School> schools = getAllSchoolInfo();
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getType().equals(type)) {
				schoolsOfSameType.add(schools.get(i));
			}
		}

		return schoolsOfSameType;

	}

	@Override
	public School searchByName(String name) {
		System.out.println("from client.." + name);
		School school = null;
		List<School> schools;

		schools = getAllSchoolInfo();
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getName().equals(name)) {
				school = schools.get(i);
				break;
			}
		}

		return school;

	}

	@Override
	public List<School> searchByCharacter(String character) {
		System.out.println("from client.." + character);
		ArrayList<School> schoolsOfSameCharacter = new ArrayList<School>();

		List<School> schools = getAllSchoolInfo();
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getCharacter().equals(character)) {
				schoolsOfSameCharacter.add(schools.get(i));
			}
		}

		return schoolsOfSameCharacter;

	}

}
