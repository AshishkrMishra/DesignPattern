package com.designpattern.creational.fmdp.msgsender.impls;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.designpattern.creational.fmdp.msgsender.MessageSender;
import com.designpattern.creational.fmdp.msgsender.MessageSenderFactory;
import com.designpattern.creational.fmdp.msgsender.enums.MesssageSenderType;
import com.designpattern.creational.fmdp.msgsender.exceptions.InvalidArgumentException;

/**
 * MessageSenderFactoryImpl -This class represent Factory Method Design Pattern
 * This class will take argument as enum and return respective sender Object It
 * takes out dependency from other class to construct MessageSender to send
 * message they just need to concentrate on preparing msg that need to be sent .
 * Now any changes in Sender logic or they it is getting initialize won't effect
 * the whole project
 * 
 * @author Ashish Kr Mishra
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class MessageSenderFactoryImpl implements MessageSenderFactory {

	/**
	 * sendersMap - it provide limitation of Application having one instance of
	 * particular MessageSender
	 */
	private static final Map<MesssageSenderType, MessageSender> sendersMap = new HashMap<MesssageSenderType, MessageSender>(
			3);

	public MessageSender createMessageSender(MesssageSenderType senderType) throws InvalidArgumentException {
		MessageSender sender = null;
		if (Objects.isNull(senderType)) {
			// Throwing Exception as Argument is Invalid
			throw new InvalidArgumentException();
		}
		switch (senderType) {
		case HTTP:
			if (sendersMap.containsKey(MesssageSenderType.HTTP)) {
				sender = sendersMap.get(MesssageSenderType.HTTP);
			} else {
				sender = new HTTPMessageSender();
				sendersMap.put(senderType, sender);
			}
			break;

		case HTTPS:
			if (sendersMap.containsKey(MesssageSenderType.HTTPS)) {
				sender = sendersMap.get(MesssageSenderType.HTTPS);
			} else {
				sender = new HTTPSMessageSender();
				sendersMap.put(senderType, sender);
			}
			break;

		case TCP:
			if (sendersMap.containsKey(MesssageSenderType.TCP)) {
				sender = sendersMap.get(MesssageSenderType.TCP);
			} else {
				sender = new TCPMessageSender();
				sendersMap.put(senderType, sender);
			}
			break;

		default:
			// Throwing Exception as Argument is Invalid
			throw new InvalidArgumentException();
		}
		return sender;
	}

}
