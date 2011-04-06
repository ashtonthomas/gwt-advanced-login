package com.acrinta.client.module_a.resource;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;

public interface Resource extends ClientBundle {
	@Source("images/ajax-loader.gif")
	ImageResource ajax_loader();
	
	@Source("images/ajax-loader2.gif")
	ImageResource ajax_loader2();
	
	@Source("images/ajax-loader3.gif")
	ImageResource ajax_loader3();
	
	@Source("images/ajax-loader4.gif")
	ImageResource ajax_loader4();
	
	@Source("images/ajax-loader5.gif")
	ImageResource ajax_loader5();
	
	@Source("images/ajax-loader6.gif")
	ImageResource ajax_loader6();
	
	@Source("images/add.gif")
	ImageResource add();
	
	@Source("images/edit.gif")
	ImageResource edit();
	
	@Source("images/green_check.gif")
	ImageResource green_check();
	
	@Source("images/remove.gif")
	ImageResource remove();
	
	@Source("images/okay.gif")
	ImageResource okay();
	
	@Source("images/error_notice.gif")
	ImageResource error_notice();
	
	@Source("images/place_holder.gif")
	ImageResource place_holder();
	
	@Source("images/star.gif")
	ImageResource star();
}
