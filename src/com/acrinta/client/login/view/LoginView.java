package com.acrinta.client.login.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends Composite {

	private static LoginViewUiBinder uiBinder = GWT
			.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	@UiField TextBox email;
	@UiField PasswordTextBox password;
	@UiField Button submit_button;
	@UiField Anchor register_link;
	@UiField SimplePanel message;
	
	public LoginView() {
		initWidget(uiBinder.createAndBindUi(this));
		submit_button.setText("Login");
		register_link.setText("Register");
	}
	
	public String getEmailValue(){
		return email.getValue();
	}
	
	public String getPasswordValue(){
		return password.getValue();
	}

	public Button getSubmitButton(){
		return submit_button;
	}
	
	public Anchor getRegisterLink(){
		return register_link;
	}

	
	public TextBox getEmailBox(){
		return email;
	}
	
	public PasswordTextBox getPasswordBox(){
		return password;
	}
	
	public SimplePanel getMessage(){
		return message;
	}
}
