package lab.microservice.forex;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exchange_value")
public class ExchangeValue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="currency_from")
	String from;

	@Column(name="currency_to")
	String to;

	double conversionMultiple;
	int port;

	public ExchangeValue() {

	}

	public ExchangeValue(String from, String to, double conversionMultiple) {
		super();
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

	public double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	

}