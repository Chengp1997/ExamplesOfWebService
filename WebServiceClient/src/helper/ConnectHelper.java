package helper;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import webservice.SearchUniversity;

public class ConnectHelper {
	 
	
	public SearchUniversity connect() throws MalformedURLException{
		URL url = new URL("http://localhost:8888/WebService?wsdl"); 
		QName qName = new QName("http://WebService/","SearchUniversityService");
		Service service = Service.create(url, qName);
		SearchUniversity port = service.getPort(SearchUniversity.class);
		return port;
	}
}
