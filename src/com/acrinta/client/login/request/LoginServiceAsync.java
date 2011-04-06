package com.acrinta.client.login.request;

import com.acrinta.shared.UserDto;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	void isAuthenticated(AsyncCallback<UserDto> callback);
	void authenticate(String email, String password, AsyncCallback<UserDto> callback);
	void logout(AsyncCallback callback);
}
