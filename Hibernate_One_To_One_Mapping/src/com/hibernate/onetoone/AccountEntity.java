package com.hibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(strategy="increment",name="Idgenerator")
@Table(name="Account")
public class AccountEntity {

	@Id
	@GeneratedValue(generator="Idgenerator")
	private Integer accountNumber;
	
	private String customerName;
	
	private String branch;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pandetails",unique=true)
	private PanDetails panDetails;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public PanDetails getPanDetails() {
		return panDetails;
	}

	public void setPanDetails(PanDetails panDetails) {
		this.panDetails = panDetails;
	}

	public AccountEntity() {
		super();
	}

	public AccountEntity(Integer accountNumber, String customerName, String branch, PanDetails panDetails) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.branch = branch;
		this.panDetails = panDetails;
	}

	@Override
	public String toString() {
		return "AccountEntity [accountNumber=" + accountNumber + ", customerName=" + customerName + ", branch=" + branch
				+ ", panDetails=" + panDetails + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((panDetails == null) ? 0 : panDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountEntity other = (AccountEntity) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (panDetails == null) {
			if (other.panDetails != null)
				return false;
		} else if (!panDetails.equals(other.panDetails))
			return false;
		return true;
	}
	
	
}
