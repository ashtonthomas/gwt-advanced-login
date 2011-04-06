package com.acrinta.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserDto implements IsSerializable {
	private int id;
	private String name;
	private String email;
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
}
