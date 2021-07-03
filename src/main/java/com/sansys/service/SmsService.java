/**
 * Sansys reserves the right to this source code. 
 * You should not modify or reuse without noticing it to sansys 
 * else it is violation of company policy. 
 * And need to provide credits where applicable. 
 */


package com.sansys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sansys.service.models.SmsRequest;

/**
 * @author Sanjeev Kulkarni
 *
 */

@Service	
public class SmsService implements SmsSender{
	
	private final SmsSender smsSender;

	@Autowired
	public SmsService(@Qualifier("twilio") TwilioSmsSender smsSender) {
		this.smsSender = smsSender;
	}

	@Override
	public void sendSms(SmsRequest smsRequest) {
		smsSender.sendSms(smsRequest);
	}
}
