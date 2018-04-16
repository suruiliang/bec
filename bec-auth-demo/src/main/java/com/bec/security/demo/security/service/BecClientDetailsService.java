package com.bec.security.demo.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;


/**
* @author suruiliang
* @version 创建时间：2018年4月11日 下午5:45:00
* @ClassName 类名称
* @Description 类描述
*/
public class BecClientDetailsService implements  ClientDetailsService{

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		BaseClientDetails clients=new BaseClientDetails();
		clients.setClientId(clientId);
		clients.setClientSecret(clientId+"secret");
		clients.setAccessTokenValiditySeconds(7200);
		List<String> authorizedGrantTypes=new ArrayList<String>();
		authorizedGrantTypes.add("refresh_token");
		authorizedGrantTypes.add("password");
		clients.setAuthorizedGrantTypes(authorizedGrantTypes);
		List<String> autoApproveScopes=new ArrayList<String>();
		autoApproveScopes.add("all");
		autoApproveScopes.add("read");
		autoApproveScopes.add("write");
		clients.setAutoApproveScopes(autoApproveScopes);
		return clients;
	}

}
