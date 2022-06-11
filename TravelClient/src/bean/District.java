package bean;

import com.show.api.ShowApiRequest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String appid="82241";
    private String appSecret="17159686b90f4b41b159976b7a447663";
    public List<JSONObject> getDistrict(String cityID){
        List<JSONObject> district = new ArrayList<JSONObject>();
        String res=new ShowApiRequest("http://route.showapi.com/268-4",appid,appSecret)
                .addTextPara("cityId",cityID)
                .post();
        JSONObject jsonObject = JSONObject.fromObject(res);
        JSONObject showapi_res_body = JSONObject.fromObject(jsonObject.getString("showapi_res_body"));
        JSONArray list = showapi_res_body.getJSONArray("list");
        for (int i=0;i<list.size();i++){
            JSONObject proInfo=JSONObject.fromObject(list.getString(i));
            district.add(proInfo);
        }
        return district;
    }
}
