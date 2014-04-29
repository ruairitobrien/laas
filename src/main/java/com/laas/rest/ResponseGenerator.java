package com.laas.rest; 

import java.util.HashMap;
import java.util.Map;

public class ResponseGenerator {
	
	private static final Map<String, String> messages;
    static
    {
        messages = new HashMap<String, String>();
        messages.put("some", "You're some langer %s -- %s");
        messages.put("whata", "%s? What a langer! -- %s");
    }
	
	public String getDefaultMessage() {
		return "You're a langer";
	}
	
	public String getMessage(String from, String to) {
		return "You are a langer " + to + ". Regards, " + from + ".";
	}
	
	public String getMessage(String option, String from, String to) {
		String message = messages.get(option);
		if(message != null) {
			return String.format(message, from, to);
		} else {
			return "Invalid option, langer!";
		}
	}
	
	public String getMessage(Request request) {
		return getMessage(request.getOption(), request.getFrom(), request.getTo());
	}
	

}
