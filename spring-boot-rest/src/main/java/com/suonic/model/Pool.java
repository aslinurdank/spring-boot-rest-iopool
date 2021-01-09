package com.suonic.model;

import javax.persistence.*;

import java.util.Date;
import java.io.Serializable;

@Entity
@Table(name = "POOL")
public class Pool implements Serializable {
	
	@Column(name = "CARDID")
	String CARDID;
	@Column(name = "CHECKDATE")
	Date CHECKDATE;
	@Column(name = "HOUR")
	String HOUR;
	@Column(name = "TERMINALID")
	int TERMINALID;
	@Column(name = "TERMINAL")
	String TERMINAL;
	@Column(name = "DEPARTMENTID")
	int DEPARTMENTID;
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCARDID() {
		return CARDID;
	}

	public void setCARDID(String cARDID) {
		CARDID = cARDID;
	}

	public Date getCHECKDATE() {
		return CHECKDATE;
	}

	public void setCHECKDATE(Date cHECKDATE) {
		CHECKDATE = cHECKDATE;
	}

	public String getHOUR() {
		return HOUR;
	}

	public void setHOUR(String hOUR) {
		HOUR = hOUR;
	}

	public int getTERMINALID() {
		return TERMINALID;
	}

	public void setTERMINALID(int tERMINALID) {
		TERMINALID = tERMINALID;
	}

	public String getTERMINAL() {
		return TERMINAL;
	}

	public void setTERMINAL(String tERMINAL) {
		TERMINAL = tERMINAL;
	}

	public int getDEPARTMENTID() {
		return DEPARTMENTID;
	}

	public void setDEPARTMENTID(int dEPARTMENTID) {
		DEPARTMENTID = dEPARTMENTID;
	}

	

}
