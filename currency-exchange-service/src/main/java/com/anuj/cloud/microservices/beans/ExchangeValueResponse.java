package com.anuj.cloud.microservices.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExchangeValueResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValueResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ExchangeValueResponse(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
