/**
 * Sansys reserves the right for this source code. 
 * You should not modify or reuse without the noticing it to sansys. 
 * And need to provide credits where applicable. 
 */


package com.sansys.service;


import com.sansys.service.models.SmsRequest;

/**
 * @author Sanjeev Kulkarni
 *
 */

public interface SmsSender {
	
	void sendSms(SmsRequest smsRequest);
}
