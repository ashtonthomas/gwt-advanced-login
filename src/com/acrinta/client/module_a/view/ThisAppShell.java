package com.acrinta.client.module_a.view;

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

public class ThisAppShell extends Composite {

	private static ThisAppShellUiBinder uiBinder = GWT
			.create(ThisAppShellUiBinder.class);

	interface ThisAppShellUiBinder extends UiBinder<Widget, ThisAppShell> {
	}

	@UiField Anchor logout_link;
	@UiField SimplePanel content;
	
	public ThisAppShell() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public Anchor getLogoutLink(){
		return logout_link;
	}
	
	public SimplePanel getContent(){
		return content;
	}

}
