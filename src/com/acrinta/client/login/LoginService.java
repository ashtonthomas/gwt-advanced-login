package com.acrinta.client.login;

import com.acrinta.shared.UserDto;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login.rpc")
public interface LoginService extends RemoteService{
	UserDto isAuthenticated();
	UserDto authenticate(String email, String password);
}
