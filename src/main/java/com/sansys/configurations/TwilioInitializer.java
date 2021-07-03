/**
 * Sansys reserves the right for this source code. 
 * You should not modify or reuse without the noticing it to sansys. 
 * And need to provide credits where applicable. 
 */


package com.sansys.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

/**
 * @author Sanjeev Kulkarni
 *
 */

@Configuration
public class TwilioInitializer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);

	@SuppressWarnings("unused")
	private final TwilioConfiguration twilioConfiguration;
	
	@Autowired
	public TwilioInitializer(TwilioConfiguration twilioConfiguration) {
		this.twilioConfiguration = twilioConfiguration;
		Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
		LOGGER.info("Twilio Initialized with Conf => "+twilioConfiguration.getAccountSid());
	}
}
