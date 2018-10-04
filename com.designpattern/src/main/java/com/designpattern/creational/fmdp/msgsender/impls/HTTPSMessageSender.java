package com.designpattern.creational.fmdp.msgsender.impls;

import org.apache.commons.lang3.StringUtils;

import com.designpattern.creational.fmdp.msgsender.MessageSender;
/**
 * HTTPSMessageSender - represent on of concrete class for MessageSender 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class HTTPSMessageSender implements MessageSender {

	public boolean sendMessage(String msg) 
	{
		if(StringUtils.isBlank(msg))
		{
			return false;
		}
		System.out.println("Sending HttpsMessage :="+msg);
		return true;
	}

}
