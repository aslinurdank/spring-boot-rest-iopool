package com.suonic.model;

import javax.persistence.*;

import java.util.Date;
import java.io.Serializable;

@Entity
@Table(name = "POOL")
public class Pool implements Serializable {
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

	public String getTCKIMLIKNO() {
		return TCKIMLIKNO;
	}

	public void setTCKIMLIKNO(String tCKIMLIKNO) {
		TCKIMLIKNO = tCKIMLIKNO;
	}

	public Date getTARIH() {
		return TARIH;
	}

	public void setTARIH(Date tARIH) {
		TARIH = tARIH;
	}

	public String getSAAT() {
		return SAAT;
	}

	public void setSAAT(String sAAT) {
		SAAT = sAAT;
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

	public int getBIRIMID() {
		return BIRIMID;
	}

	public void setBIRIMID(int bIRIMID) {
		BIRIMID = bIRIMID;
	}

	@Column(name = "TCKIMLIKNO")
	String TCKIMLIKNO;
	@Column(name = "TARIH")
	Date TARIH;
	@Column(name = "SAAT")
	String SAAT;
	@Column(name = "TERMINALID")
	int TERMINALID;
	@Column(name = "TERMINAL")
	String TERMINAL;
	@Column(name = "BIRIMID")
	int BIRIMID;

}
