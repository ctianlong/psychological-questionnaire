package com.tongji.beans;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
public class GetWeiboParams {
	public String access_token;//采用OAuth授权方式为必填参数，OAuth授权后获得。
	public String uid;//需要查询的用户ID。
	public String screen_name;//需要查询的用户昵称
	public String since_id;//若指定此参数，则返回ID比since_id大的微博（即比since_id时间晚的微博），默认为0。
	public String max_id;//若指定此参数，则返回ID小于或等于max_id的微博，默认为0。
	public String count;
	public String page;//返回结果的页码，默认为1。
	public String base_app;//是否只获取当前应用的数据。0为否（所有数据），1为是（仅当前应用），默认为0。
	public String feature;//过滤类型ID，0：全部、1：原创、2：图片、3：视频、4：音乐，默认为0。
	public String trim_user;//返回值中user字段开关，0：返回完整user字段、1：user字段仅返回user_id，默认为0。
	
	public List<NameValuePair> getRequestParams() {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		if(this.access_token!=null)
		params.add(new BasicNameValuePair("access_token", this.access_token));
		if(this.uid!=null)
			params.add(new BasicNameValuePair("uid", this.uid));
		if(this.screen_name!=null)
			params.add(new BasicNameValuePair("screen_name", this.screen_name));
		if(this.since_id!=null)
			params.add(new BasicNameValuePair("since_id", this.since_id));
		if(this.max_id!=null)
			params.add(new BasicNameValuePair("max_id", this.max_id));
		if(this.count!=null)
			params.add(new BasicNameValuePair("count", this.count));
		if(this.page!=null)
			params.add(new BasicNameValuePair("page", this.page));
		if(this.base_app!=null)
			params.add(new BasicNameValuePair("base_app", this.base_app));
		if(this.feature!=null)
			params.add(new BasicNameValuePair("feature", this.feature));
		if(this.trim_user!=null)
			params.add(new BasicNameValuePair("trim_user", this.trim_user));
		return params;
		
	}

}
