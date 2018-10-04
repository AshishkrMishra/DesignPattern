package com.designpattern.creational.fmdp.msgsender;

import com.designpattern.creational.fmdp.msgsender.enums.MesssageSenderType;
import com.designpattern.creational.fmdp.msgsender.exceptions.InvalidArgumentException;

public interface MessageSenderFactory 
{
	public MessageSender  createMessageSender( MesssageSenderType senderType) throws  InvalidArgumentException;
}
