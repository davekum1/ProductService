package com.tgt.myretail.util;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

	
	private String status;
	@JsonProperty
	private String message;
	private List<String> errors;
	
	public Message() {
		super();
	}
	
	public Message(final String status, final String message, final List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;		
	}
	
	 public Message(final String status, final String message, final String error) {
	    super();
	    this.status = status;
	    this.message = message;
	    errors = Arrays.asList(error);
	 }
	
	public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(final List<String> errors) {
        this.errors = errors;
    }

    public void setError(final String error) {
        errors = Arrays.asList(error);
    }
}
