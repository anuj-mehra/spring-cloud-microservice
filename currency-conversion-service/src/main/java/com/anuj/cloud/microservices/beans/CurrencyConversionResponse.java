package com.anuj.cloud.microservices.beans;

import java.math.BigDecimal;

public class CurrencyConversionResponse {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal requestedQuantity;
	private BigDecimal finalValue;
	private int port;
	
	public CurrencyConversionResponse() {
		super();
	}
	
	public CurrencyConversionResponse(Long id, String from, String to, BigDecimal conversionMultiple,
			BigDecimal requestedQuantity, BigDecimal finalValue, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.requestedQuantity = requestedQuantity;
		this.finalValue = finalValue;
		this.port = port;
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
	public BigDecimal getRequestedQuantity() {
		return requestedQuantity;
	}
	public void setRequestedQuantity(BigDecimal requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
	public BigDecimal getFinalValue() {
		return finalValue;
	}
	public void setFinalValue(BigDecimal finalValue) {
		this.finalValue = finalValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
