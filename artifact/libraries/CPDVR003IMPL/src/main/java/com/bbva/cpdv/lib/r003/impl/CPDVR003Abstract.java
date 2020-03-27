package com.bbva.cpdv.lib.r003.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.cpdv.lib.r003.CPDVR003;

public abstract class CPDVR003Abstract extends AbstractLibrary implements CPDVR003 {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPDVR003.class);
	
	protected ApplicationConfigurationService applicationConfigurationService;
	
	/**
	 * @param applicationConfigurationService the applicationConfigurationService to set
	 */
	public void setApplicationConfigurationService(
			ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}
	
}
