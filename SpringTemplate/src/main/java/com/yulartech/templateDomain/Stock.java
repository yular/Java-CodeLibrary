package com.yulartech.templateDomain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "stock", catalog = "yular", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long stockId;
	private String stockCode;
	private String stockName;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	public Long getStockId(){
		return stockId;
	}
	
	public void setStockid(Long stockId){
		this.stockId = stockId;
	}
	
	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode(){
		return stockCode;
	}
	
	public void setStockCode(String stockCode){
		this.stockCode = stockCode;
	}
	
	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
	public String getStockName(){
		return stockName;
	}
	
	public void setStockName(String stockName){
		this.stockName = stockName;
	}
	
	@Override
	public String toString() {
		return "Stock [stockCode=" + stockCode + ", stockId=" + stockId
				+ ", stockName=" + stockName + "]";
	}
	
}