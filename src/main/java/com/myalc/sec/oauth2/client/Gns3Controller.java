package com.myalc.sec.oauth2.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.web.client.RequestAttributeClientRegistrationIdResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class Gns3Controller {

	@Autowired
	private final RestClient restClient;

	@Autowired
	private final ApplicationProperties prop;

	@Autowired
	private RestClientConfig restClientConfig;

	public Gns3Controller(RestClient restClient, ApplicationProperties prop) {
		this.restClient = restClient;
		this.prop = prop;
	}

	@GetMapping("/v0/projects")
	public String fetchProjects() {
		String str = restClient.get().uri(prop.getGns3Backend() + "/v3/projects")
				.attributes(RequestAttributeClientRegistrationIdResolver.clientRegistrationId("gns3-client")).retrieve()
				.body(String.class);
		System.out.println(restClientConfig.readAccessToken());
		return str;
	}

}
