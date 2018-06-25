package br.com.database.project.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "amr_redelinear")
public class Nurse implements Serializable
{

	@Id
	@Column(name = "nurse_id")
	private BigDecimal id;
	
	@NotNull
	@Id
	@Column(name = "nurse_name")
	private String name;
	
	@NotNull
	@Id
	@Column(name = "nurse_birth")
	private Date birth;

	public BigDecimal getId()
	{
		return id;
	}

	public void setId(BigDecimal id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getBirth()
	{
		return birth;
	}

	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
}