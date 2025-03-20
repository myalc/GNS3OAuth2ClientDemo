package com.myalc.sec.oauth2.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@EnableConfigurationProperties
@Setter
@Getter
public class ApplicationProperties {

	@Value("${spring.security.oauth2.client.provider.gns3-provider.backend-host}")
	private String gns3Backend;
	
	@Value("${spring.security.oauth2.client.registration.gns3-client.username}")
	private String gns3CredUser;
	
	@Value("${spring.security.oauth2.client.registration.gns3-client.password}")
	private String gns3CredPassw;

	@Override
	public String toString() {
		return "ApplicationProperties [gns3Backend=" + gns3Backend + ", gns3CredUser=" + gns3CredUser
				+ ", gns3CredPassw=" + "***" + "]";
	}
	
	
}
