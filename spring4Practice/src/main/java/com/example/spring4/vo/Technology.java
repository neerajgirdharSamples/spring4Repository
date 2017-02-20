package main.java.com.example.spring4.vo;

import org.springframework.stereotype.Component;

@Component
public class Technology {
	private String secondaryExpertise;
	private String primaryExpertise;
	public String getPrimaryExpertise() {
		return primaryExpertise;
	}
	public void setPrimaryExpertise(String primaryExpertise) {
		this.primaryExpertise = primaryExpertise;
	}
	public String getSecondaryExpertise() {
		return secondaryExpertise;
	}
	public void setSecondaryExpertise(String secondaryExpertise) {
		this.secondaryExpertise = secondaryExpertise;
	}
	
	}
