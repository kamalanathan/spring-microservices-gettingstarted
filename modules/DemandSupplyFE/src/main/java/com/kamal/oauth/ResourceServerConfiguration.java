package com.kamal.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated();
		// .authenticated();
		// http.authorizeRequests().antMatchers(HttpMethod.DELETE,
		// "/v1/organizations/**").hasRole("ADMIN").anyRequest()
		// .authenticated();
	}
}
