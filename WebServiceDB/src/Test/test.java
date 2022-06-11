package Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
public class test {
	
	public String getPath() throws IOException {
		String filePath="src/resource/schoolsInChina.xml";
		return filePath;
	}
	public static void main(String arge[]) throws IOException {   
		test t=new test();
		
		
		
		 File f = new File(t.getPath());   
		 try {   
			      SAXBuilder builder = new SAXBuilder();   
			      Document doc = builder.build(f);   
			      Element foo = doc.getRootElement();   
			      List<Element> allChildren = foo.getChildren();   
			     for (int i = 0; i < allChildren.size(); i++) {   
			    	 if (((Element)allChildren.get(i)).getChild("name")!=null) {
			    		 System.out.print("name:"+ ((Element) allChildren.get(i)).getChild("name").getText());   
					}
			    	 if (((Element)allChildren.get(i)).getChild("province")!=null) {
			    		 System.out.println("province:"+ ((Element) allChildren.get(i)).getChild("province").getText());   
					}
			    	 if (((Element)allChildren.get(i)).getChild("type")!=null) {
			    		 System.out.println("type:"+ ((Element) allChildren.get(i)).getChild("type").getText());   
					}
			    	 if (((Element)allChildren.get(i)).getChild("character")!=null) {
			    		 System.out.println("character:"+ ((Element) allChildren.get(i)).getChild("character").getText());   
					}
			    	 if (((Element)allChildren.get(i)).getChild("type211")!=null) {
			    		 System.out.println("type211:"+ ((Element) allChildren.get(i)).getChild("type211").getText());   
					}
			    	 if (((Element)allChildren.get(i)).getChild("type985")!=null) {
			    		 System.out.println("type985:"+ ((Element) allChildren.get(i)).getChild("type985").getText());   
					}
			       
			      
			      }   
			     System.out.println(allChildren.size());
			     } catch (Exception e) {   
			      e.printStackTrace();   
			     }   
		 	
		    
		 } 
}
