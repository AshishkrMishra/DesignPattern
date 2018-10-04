package com.designpattern.creational.fmdp;

import org.junit.Before;
import org.junit.Test;

import com.designpattern.creational.fmdp.msgsender.MessageSenderFactory;
import com.designpattern.creational.fmdp.msgsender.enums.MesssageSenderType;
import com.designpattern.creational.fmdp.msgsender.exceptions.InvalidArgumentException;
import com.designpattern.creational.fmdp.msgsender.impls.MessageSenderFactoryImpl;

/**
 * Unit test for simple App.
 */
public class FactoryMethodDesignPatternTest 
{
	private MessageSenderFactory msf=null;
	
	@Before
	public void before()
	{
		msf = new MessageSenderFactoryImpl();
	}
	
	@Test
	public void testHTTP() throws InvalidArgumentException
	{
		msf.createMessageSender(MesssageSenderType.HTTP).sendMessage("Hello World");
	}
	
	@Test
	public void testHTTPS() throws InvalidArgumentException
	{
		msf.createMessageSender(MesssageSenderType.HTTPS).sendMessage("Hello World");
	}
	
	@Test
	public void testTCP() throws InvalidArgumentException
	{
		msf.createMessageSender(MesssageSenderType.TCP).sendMessage("Hello World");
	}
	
	@Test(expected=InvalidArgumentException.class)
	public void testException() throws InvalidArgumentException 
	{
		MessageSenderFactory msf = new MessageSenderFactoryImpl();
		msf.createMessageSender(null);
	}
}
