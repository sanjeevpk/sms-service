/**
 * Sansys reserves the right to this source code. 
 * You should not modify or reuse without noticing it to sansys 
 * else it is violation of company policy. 
 * And need to provide credits where applicable. 
 */


package com.sansys.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sanjeev Kulkarni
 *
 */

public class SmsRequest {
	private final String phoneNumber; //destination
	private final String message;

	public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber, 
			@JsonProperty("message") String message) {
		super();
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "SmsRequest [phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}
	
}
