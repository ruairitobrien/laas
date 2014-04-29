package com.laas.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LangerController {
	
	ResponseGenerator responseGenerator;
	
	public LangerController() {
		this.responseGenerator = new ResponseGenerator();
	}

	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefault() {
		return responseGenerator.getDefaultMessage();
	}
	
	@ResponseBody
	@RequestMapping(value = "/{from}/{to}", method = RequestMethod.GET)
	public String getMessage(@PathVariable String from, @PathVariable String to) {
		return responseGenerator.getMessage(from, to);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{option}/{from}/{to}", method = RequestMethod.GET)
	public String getMessage(@PathVariable String option, @PathVariable String from, @PathVariable String to) {
		return responseGenerator.getMessage(option, from, to);
	}
	
	@RequestMapping(value="langer", method=RequestMethod.POST)
    @ResponseBody
    public String getMessage(@RequestBody Request request) {        
        return responseGenerator.getMessage(request);
    }
	
	@RequestMapping(value="langer", method=RequestMethod.PUT)
    @ResponseBody
    public String updateMessage(@RequestBody Request request) {        
        return "UPDATED: " + request;
    }
	
	@RequestMapping(value="langer", method=RequestMethod.DELETE)
    @ResponseBody
    public String deleteMessage(@RequestBody Request request) {        
        return "DELETED: " + request;
    }
}
