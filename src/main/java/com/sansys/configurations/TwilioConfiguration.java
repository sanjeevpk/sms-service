/**
 * Sansys reserves the right for this source code. 
 * You should not modify or reuse without the noticing it to sansys. 
 * And need to provide credits where applicable. 
 */


package com.sansys.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sanjeev Kulkarni
 *
 */

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {
	private String accountSid;
	private String authToken;
	private String trialNumber;
	
	public TwilioConfiguration() {
	}
	
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getTrialNumber() {
		return trialNumber;
	}
	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}
	
}
