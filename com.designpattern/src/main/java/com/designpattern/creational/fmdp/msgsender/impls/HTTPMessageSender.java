package com.designpattern.creational.fmdp.msgsender.impls;

import org.apache.commons.lang3.StringUtils;

import com.designpattern.creational.fmdp.msgsender.MessageSender;
/**
 * HTTPMessageSender - represent logic of sending HTTP message
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class HTTPMessageSender implements MessageSender {

	public boolean sendMessage(String msg) 
	{
		if(StringUtils.isBlank(msg))
		{
			return false;
		}
		System.out.println("Sending HttpMessage :="+msg);
		return true;
	}

}
