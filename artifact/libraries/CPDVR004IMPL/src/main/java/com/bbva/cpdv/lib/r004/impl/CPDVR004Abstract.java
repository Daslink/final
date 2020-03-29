package com.bbva.cpdv.lib.r004.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.cpdv.lib.r004.CPDVR004;

public abstract class CPDVR004Abstract extends AbstractLibrary implements CPDVR004 {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPDVR004.class);
	
	protected ApplicationConfigurationService applicationConfigurationService;
	
	/**
	 * @param applicationConfigurationService the applicationConfigurationService to set
	 */
	public void setApplicationConfigurationService(
			ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}
	
}
