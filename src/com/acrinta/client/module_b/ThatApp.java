package com.acrinta.client.module_b;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThatApp implements EntryPoint{
	public void onModuleLoad(){
		RootLayoutPanel.get().add(new HTML("That App!"));
	}
}
