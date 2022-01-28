package com.mouritech.onetooneexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_details")
public class Stock_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stockDetailsId;

	@Column(name = "comp_name")
	private String compName;

	@Column(name = "comp_desc")
	private String compDesc;

	@Column(name = "remark")
	private String compRemark;
	@Column(name = "date")
	private String listedDate;

	public Stock_Details() {
		// TODO Auto-generated constructor stub
	}

	public Stock_Details(String compName, String compDesc, String compRemark, String listedDate) {
		super();
		this.compName = compName;
		this.compDesc = compDesc;
		this.compRemark = compRemark;
		this.listedDate = listedDate;
	}

	public Stock_Details(Long stockDetailsId, String compName, String compDesc, String compRemark, String listedDate) {
		super();
		this.stockDetailsId = stockDetailsId;
		this.compName = compName;
		this.compDesc = compDesc;
		this.compRemark = compRemark;
		this.listedDate = listedDate;
	}

	public Long getStockDetailsId() {
		return stockDetailsId;
	}

	public void setStockDetailsId(Long stockDetailsId) {
		this.stockDetailsId = stockDetailsId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public String getCompRemark() {
		return compRemark;
	}

	public void setCompRemark(String compRemark) {
		this.compRemark = compRemark;
	}

	public String getListedDate() {
		return listedDate;
	}

	public void setListedDate(String listedDate) {
		this.listedDate = listedDate;
	}

	@Override
	public String toString() {
		return "Stock_Details [stockDetailsId=" + stockDetailsId + ", compName=" + compName + ", compDesc=" + compDesc
				+ ", compRemark=" + compRemark + ", listedDate=" + listedDate + "]";
	}

}
