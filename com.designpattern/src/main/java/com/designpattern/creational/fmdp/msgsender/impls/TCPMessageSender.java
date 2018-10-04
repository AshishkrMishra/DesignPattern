package com.designpattern.creational.fmdp.msgsender.impls;

import org.apache.commons.lang3.StringUtils;

import com.designpattern.creational.fmdp.msgsender.MessageSender;
/**
 * TCPMessageSender - represents TCP message sender 
 */
public class TCPMessageSender implements MessageSender {

	public boolean sendMessage(String msg) 
	{
		if(StringUtils.isBlank(msg))
		{
			return false;
		}
		System.out.println("Sending TCPMessage :="+msg);
		return true;
	}

}
