package com.kamal.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class PropertyConfiguration {
	@Value("${block.demands}")
	private boolean propertyConfiguration;

	public boolean isPropertyConfiguration() {
		return propertyConfiguration;
	}

	public void setPropertyConfiguration(boolean propertyConfiguration) {
		this.propertyConfiguration = propertyConfiguration;
	}

}
