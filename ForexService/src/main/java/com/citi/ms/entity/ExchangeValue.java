package com.citi.ms.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="exchange")
public class ExchangeValue {

	@Id
	private int id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal multiple;
	
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ExchangeValue(int id, String from, String to, BigDecimal multiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiple = multiple;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public BigDecimal getMultiple() {
		return multiple;
	}

	public void setMultiple(BigDecimal multiple) {
		this.multiple = multiple;
	}

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", froom=" + from + ", to=" + to + ", multiple=" + multiple + "]";
	}
	
}
