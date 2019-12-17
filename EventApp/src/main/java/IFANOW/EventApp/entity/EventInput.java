package IFANOW.EventApp.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventInput {

	private Integer transactionid;
	
	private Integer userid;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp timestamp;
	
	private String location;
	
	private String noun;
	
	private String verb;
	
	private String properties;

	private String text;
	
	
	
	

	public EventInput(Integer transactionid, Integer userid, Timestamp timestamp, String location, String noun,
			String verb, String properties, String text) {
		this.transactionid = transactionid;
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.properties = properties;
		this.text = text;
	}

	public EventInput(Integer userid, Timestamp timestamp, String location, String noun, String verb, String properties,
			String text) {
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.properties = properties;
		this.text = text;
	}

	public EventInput() {
	}

	public EventInput(Integer userid, Timestamp timestamp, String location, String noun, String verb, String properties) {
		this.userid = userid;
		this.timestamp = timestamp;
		this.location = location;
		this.noun = noun;
		this.verb = verb;
		this.properties = properties;
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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
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

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
