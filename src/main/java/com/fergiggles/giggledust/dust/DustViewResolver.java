package com.fergiggles.giggledust.dust;

import org.springframework.web.servlet.view.AbstractTemplateViewResolver;

public class DustViewResolver extends AbstractTemplateViewResolver {
	public DustViewResolver() {
		setViewClass(requiredViewClass());
	}
	
	@Override
	protected Class requiredViewClass() { 
		return DustView.class;
	}
}
