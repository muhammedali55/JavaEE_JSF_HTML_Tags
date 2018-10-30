package com.muhammet;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] data= {"1","2"};

	private String radioData ="1";
	
	private String secilenIl="";
	
	
	
	public String getSecilenIl() {
		return secilenIl;
	}

	public void setSecilenIl(String secilenIl) {
		this.secilenIl = secilenIl;
	}

	public String getRadioData() {
		return radioData;
	}

	public void setRadioData(String radioData) {
		this.radioData = radioData;
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}
	
	
}
