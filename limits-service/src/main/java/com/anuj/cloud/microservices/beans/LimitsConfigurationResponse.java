package com.anuj.cloud.microservices.beans;

public class LimitsConfigurationResponse {

	private int maximum;
	private int minimum;

	protected LimitsConfigurationResponse(){

	}

	public LimitsConfigurationResponse(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
