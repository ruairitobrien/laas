package com.laas.rest;

public class Request {
	
	private String from;
	private String to;
	private String option;
	

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	@Override
	public String toString() {
		return this.option + " " + this.from + " " + this.to;
	}

}
