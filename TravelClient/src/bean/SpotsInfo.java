package bean;

import com.show.api.ShowApiRequest;
import net.sf.json.JSONObject;


public class SpotsInfo {

	private String appid="82241";
    private String appSecret="17159686b90f4b41b159976b7a447663";
//	private String appSecret="c6dc60bbc0e740b79eda7072bd7ca949";
//	private String appid="82067";
    private String spotsInfo;

    public JSONObject getPageBeanInfo(String keyword,String porID,String cityID,String areaID, String page){
       
        String res=new ShowApiRequest("http://route.showapi.com/268-1",appid,appSecret)
                .addTextPara("keyword",keyword)
                .addTextPara("proId",porID)
                .addTextPara("cityId",cityID)
                .addTextPara("areaId",areaID)
                .addTextPara("page",page)
                .post();
        this.spotsInfo=res;

        JSONObject jsonObject = JSONObject.fromObject(spotsInfo);
        JSONObject showapi_res_body = JSONObject.fromObject(jsonObject.getString("showapi_res_body"));
        JSONObject pagebean=JSONObject.fromObject(showapi_res_body.getString("pagebean"));
       
        return pagebean;
    }
}
