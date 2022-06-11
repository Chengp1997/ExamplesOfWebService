package entity;

public class School {
	private String name;
	private String province;
	private String type;
	private String character;
	private String type211;
	private String type985;
	private String website;
	private String abbreviation;
	private String city;
	public School() {
		// TODO Auto-generated constructor stub
		this.type211="·ñ";
		this.type985="·ñ";
		this.name="";
		this.province="";
		this.character="";
		this.type="";
		this.website="ÎÞ¹ÙÍø";
		this.abbreviation="";
		this.city="";
	}
	
	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getType211() {
		return type211;
	}

	public void setType211(String type211) {
		this.type211 = type211;
	}

	public String getType985() {
		return type985;
	}

	public void setType985(String type985) {
		this.type985 = type985;
	}

	public String getName() {
		return name;
	}

	public String getProvince() {
		return province;
	}

	public String getType() {
		return type;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setProvince(String province){
		this.province=province;
	}
	
	public void setType(String type){
		this.type=type;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
