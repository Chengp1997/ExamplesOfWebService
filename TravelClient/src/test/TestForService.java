package test;

import java.util.List;
import bean.Province;
import bean.SpotsInfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestForService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Province province = new Province();
	        List<JSONObject> provinces=province.getProvince();
	        for (int i=0;i<provinces.size();i++){
	            System.out.print(provinces.get(i).getString("name"));
	        }
	        System.out.println();
	        
	        
	        
	        SpotsInfo test1=new SpotsInfo();
	        JSONObject pagebean=test1.getPageBeanInfo("̩ɽ", "", "", "", "");
	
	        JSONArray contentlist =pagebean.getJSONArray("contentlist");
	
	        JSONObject spotsInfo=JSONObject.fromObject(contentlist.getString(0));
	        System.out.println(spotsInfo.getString("location"));
	
	        JSONObject location=JSONObject.fromObject(spotsInfo.getString("location"));
	        System.out.println(location.getString("lat"));
	
	        JSONArray picList=spotsInfo.getJSONArray("picList");
	
	        for (int i=0;i<picList.size();i++){
	            JSONObject pic =JSONObject.fromObject(picList.getString(i));
	            System.out.println(pic.getString("picUrl"));
	        }
	
	        JSONArray priceList=spotsInfo.getJSONArray("priceList");
	
	        for (int i=0;i<priceList.size();i++){
	            JSONObject price =JSONObject.fromObject(priceList.getString(i));
	            System.out.println(price.getString("picUrl"));
	        }
	
   
	        
	}

}
