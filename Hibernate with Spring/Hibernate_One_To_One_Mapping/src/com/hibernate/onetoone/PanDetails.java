package com.hibernate.onetoone;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(strategy="increment",name="pangenerator")
@Table(name="pandetails")
public class PanDetails {

	@Id
	@GeneratedValue(generator="pangenerator")
	private String panId;
	
	private String name;
	@Temporal(TemporalType.DATE)
	private Calendar dob;
	
	public String getPanId() {
		return panId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	
	public PanDetails() {
		super();
	}
	public PanDetails(String panId, String name, Calendar dob) {
		super();
		this.panId = panId;
		this.name = name;
		this.dob = dob;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((panId == null) ? 0 : panId.hashCode());
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
		PanDetails other = (PanDetails) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (panId == null) {
			if (other.panId != null)
				return false;
		} else if (!panId.equals(other.panId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PanDetails [panId=" + panId + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	
	
}
