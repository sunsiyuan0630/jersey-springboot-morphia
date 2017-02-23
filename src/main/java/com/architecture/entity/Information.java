package com.architecture.entity;

import org.bson.types.ObjectId;

public class Information {

//	@MongoObjectId
	private String _id;
	private Long Num_Follows;
	private String Province;
	private Long Num_Tweets;
	private String URL;
	private String Gender;
	private Integer Num_Fams;
	private String NickName;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Long getNum_Follows() {
		return Num_Follows;
	}
	public void setNum_Follows(Long num_Follows) {
		Num_Follows = num_Follows;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public Long getNum_Tweets() {
		return Num_Tweets;
	}
	public void setNum_Tweets(Long num_Tweets) {
		Num_Tweets = num_Tweets;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public Integer getNum_Fams() {
		return Num_Fams;
	}
	public void setNum_Fams(Integer num_Fams) {
		Num_Fams = num_Fams;
	}
	
	
	
}
