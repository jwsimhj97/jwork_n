package com.dto;

public class MemberBean {
	private String id;
	private String name = "이루마";
	private String[] hobby = new String[3];

	public MemberBean() {}
	
	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}