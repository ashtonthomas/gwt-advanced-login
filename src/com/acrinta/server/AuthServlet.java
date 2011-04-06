package com.acrinta.server;

import javax.servlet.http.HttpSession;

import com.acrinta.client.login.request.LoginService;
import com.acrinta.shared.UserDto;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AuthServlet extends AdvancedServlet implements LoginService {
	
	public void logout(){
		setUser(null);
	}

	public UserDto isAuthenticated() {
		return getUser(); //helper method from AdvancedServlet
	}

	public UserDto authenticate(String email, String password) {
		//check to see if the email exist in the datastore
		//check passwords
		// *** Test Code ****
		UserDto user = new UserDto();
		if(email.contains("go")){
			user.setEmail(email);
			user.setId(12);
			user.setName("NameFromDb");
			
			//set the current_user for this session
			setUser(user);//see AdvncedServlet (Parent Class)
			
		}else{
			user = null;//force showLogin
		}
		
		return user;
	}

}
