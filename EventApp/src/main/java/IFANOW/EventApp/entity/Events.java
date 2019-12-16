package IFANOW.EventApp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;

@Entity
@Table(name = "events")
public class Events implements Serializable {

	@Id
	@Column(name = "transaction_id")
    private Integer transactionid;
	
	@Column(name = "user_id")
    private Integer userid;
	
	@Column(name = "timestamp")
	private String timestamp;
	
	@Column(name = "location")
	private String location;
	
	@Column(name="noun")
	private String noun;
	
	@Column(name="verb")
	private String verb;
	
	@Column(name="timespent")
	private String timespent;
	
	@Column(name="bank")
	private String bank;
	
	@Column(name="merchantId")
	private String merchantId;
	
	@Column(name="value")
	private Long value;
	
	@Column(name="mode")
	private String mode;
	
	@Column(name="text")
	private String text;
	
	@Column(name="description")
	private String description;

	
	
	
	public Events(Integer transactionid, Integer userid, String timestamp, String location, String noun, String verb,
			String timespent, String bank, String merchantId, Long value, String mode, String text,
			String description) {
		this.transactionid = transactionid;
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.timespent = timespent;
		this.bank = bank;
		this.merchantId = merchantId;
		this.value = value;
		this.mode = mode;
		this.text = text;
		this.description = description;
	}

	public Events(Integer userid, String timestamp, String location, String noun, String verb, String timespent,
			String bank, String merchantId, Long value, String mode, String text, String description) {
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.timespent = timespent;
		this.bank = bank;
		this.merchantId = merchantId;
		this.value = value;
		this.mode = mode;
		this.text = text;
		this.description = description;
	}

	public Events()
	{
		
	}
	
	public Events(Integer userid, String timestamp, String location, String noun, String verb, String timespent,
			String bank, String merchantId, Long value, String mode, String text) {
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.timespent = timespent;
		this.bank = bank;
		this.merchantId = merchantId;
		this.value = value;
		this.mode = mode;
		this.text = text;
	}


	

	public Integer getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}

	public Integer getUserid() {
		return userid;
	}




	public void setUserid(Integer userid) {
		this.userid = userid;
	}




	public String getTimestamp() {
		return timestamp;
	}




	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getNoun() {
		return noun;
	}




	public void setNoun(String noun) {
		this.noun = noun;
	}




	public String getVerb() {
		return verb;
	}




	public void setVerb(String verb) {
		this.verb = verb;
	}




	public String getTimespent() {
		return timespent;
	}




	public void setTimespent(String timespent) {
		this.timespent = timespent;
	}




	public String getBank() {
		return bank;
	}




	public void setBank(String bank) {
		this.bank = bank;
	}




	public String getMerchantId() {
		return merchantId;
	}




	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}




	public Long getValue() {
		return value;
	}




	public void setValue(Long value) {
		this.value = value;
	}




	public String getMode() {
		return mode;
	}




	public void setMode(String mode) {
		this.mode = mode;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}


	


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
