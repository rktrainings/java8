/**
 * 
 */
package com.rktrainings.java8.dto;

/**
 * @author RavikumarPothannagar
 *
 */
public class Account {
	
	private Long guid;
    private String accountNumber;
    private String accountName;
    private String status;
    private String type;
    
    
    /**
	 * @param guid
	 * @param accountNumber
	 * @param accountName
	 * @param status
	 * @param type
	 */
	public Account(Long guid, String accountNumber, String accountName, String status, String type) {
		//super();
		this.guid = guid;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.status = status;
		this.type = type;
	}
    
    
    public Long getGuid() {
		return guid;
	}
	public void setGuid(Long guid) {
		this.guid = guid;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
