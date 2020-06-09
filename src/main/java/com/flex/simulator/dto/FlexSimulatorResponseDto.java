package com.flex.simulator.dto;

import java.io.Serializable;

public class FlexSimulatorResponseDto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String primaryCurrency;
	
	private String secondaryCurrency;
	
	private Double crossRate;
	
	private Integer quote;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimaryCurrency() {
		return primaryCurrency;
	}

	public void setPrimaryCurrency(String primaryCurrency) {
		this.primaryCurrency = primaryCurrency;
	}

	public String getSecondaryCurrency() {
		return secondaryCurrency;
	}

	public void setSecondaryCurrency(String secondaryCurrency) {
		this.secondaryCurrency = secondaryCurrency;
	}

	public Double getCrossRate() {
		return crossRate;
	}

	public void setCrossRate(Double crossRate) {
		this.crossRate = crossRate;
	}

	public Integer getQuote() {
		return quote;
	}

	public void setQuote(Integer quote) {
		this.quote = quote;
	}
	
	
	

}
