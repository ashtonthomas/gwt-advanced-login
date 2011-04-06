package com.acrinta.client.module_a;

import com.acrinta.client.login.request.LoginService;
import com.acrinta.client.login.request.LoginServiceAsync;
import com.acrinta.client.module_a.view.ThisAppShell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThisApp implements EntryPoint{
	ThisAppShell shell = GWT.create(ThisAppShell.class);
	LoginServiceAsync loginService = GWT.create(LoginService.class);
	
	public void onModuleLoad(){
		RootLayoutPanel.get().clear();
		RootLayoutPanel.get().add(shell);
		shell.getLogoutLink().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				loginService.logout(new AsyncCallback(){
					public void onFailure(Throwable caught) {
						
					}
					public void onSuccess(Object result) {
						
					}
				});
				Window.Location.assign("");
			}
		});
		shell.getContent().setWidget(new HTML("content here for this app.."));
		
	}
}
