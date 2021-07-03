/**
 * Sansys reserves the right for this source code. 
 * You should not modify or reuse without the noticing it to sansys. 
 * And need to provide credits where applicable. 
 */


package com.sansys.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sansys.configurations.TwilioConfiguration;
import com.sansys.service.models.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * @author Sanjeev Kulkarni
 *
 */

@Service("twilio")
public class TwilioSmsSender implements SmsSender{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);
	
	private final TwilioConfiguration twilioConfiguration;
	
	@Autowired
	public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
		this.twilioConfiguration = twilioConfiguration;
	}

	/**
	 * @param string
	 * @return
	 */
	private boolean isValidPhoneNumber(String string) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void sendSms(SmsRequest smsRequest) {
		if (isValidPhoneNumber(smsRequest.getPhoneNumber())) {
			
			Message.creator(
					new PhoneNumber(smsRequest.getPhoneNumber()),
					new PhoneNumber(twilioConfiguration.getTrialNumber()), 
					smsRequest.getMessage()).create();
			
			LOGGER.info("Send SMS {}", smsRequest);
		} else {
			throw new IllegalArgumentException("Phone number <" + smsRequest.getPhoneNumber() + "> is invalid");
		}
	}

}
