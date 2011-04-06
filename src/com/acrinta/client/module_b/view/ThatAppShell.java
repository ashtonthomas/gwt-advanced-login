package com.acrinta.client.module_b.view;

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
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class ThatAppShell extends Composite {

	private static ThatAppShellUiBinder uiBinder = GWT
			.create(ThatAppShellUiBinder.class);

	interface ThatAppShellUiBinder extends UiBinder<Widget, ThatAppShell> {
	}

	@UiField Anchor logout_link;
	@UiField SimplePanel content;
	
	public ThatAppShell() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public Anchor getLogoutLink(){
		return logout_link;
	}
	
	public SimplePanel getContent(){
		return content;
	}
}
