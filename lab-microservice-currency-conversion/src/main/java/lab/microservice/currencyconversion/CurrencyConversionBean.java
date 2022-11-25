package lab.microservice.currencyconversion;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private String from;
	private String to;
	private double conversionMultiple;
	private double quantity;
	private double totalCalculatedAmount;
	private int port;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean( String from, String to, double conversionMultiple, double quantity,
	      double totalCalculatedAmount, int port) {
	    super();
	    this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
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

	public double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	
}
