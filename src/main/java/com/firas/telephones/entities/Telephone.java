package com.firas.telephones.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
public class Telephone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTel;
	
	@NotNull
	@Size (min = 4,max = 15)
	private String marqueTel;
	
	@Min(value = 10)
	@Max(value = 10000)
	private Double prixTel;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
	private Date dateCreation;
	
	@ManyToOne
	private Company company;
	
	
	
	public Telephone() {
		super();
	}
	
	
	
	public Telephone(String marqueTel, Double prixTel, Date dateCreation) {
		super();
		this.marqueTel = marqueTel;
		this.prixTel = prixTel;
		this.dateCreation = dateCreation;
	}



	public Long getIdTel() {
		return idTel;
	}
	public void setIdTel(Long idTel) {
		this.idTel = idTel;
	}
	public String getMarqueTel() {
		return marqueTel;
	}
	public void setMarqueTel(String marqueTel) {
		this.marqueTel = marqueTel;
	}
	public Double getPrixTel() {
		return prixTel;
	}
	public void setPrixTel(Double prixTel) {
		this.prixTel = prixTel;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Override
	public String toString() {
		return "Telephone [idTel=" + idTel + ", marqueTel=" + marqueTel + ", prixTel=" + prixTel + ", dateCreation="
				+ dateCreation + "]";
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
