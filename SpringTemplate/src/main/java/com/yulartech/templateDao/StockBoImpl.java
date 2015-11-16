package com.yulartech.templateDao;

import org.springframework.stereotype.Service;

import com.yulartech.templateDomain.Stock;

@Service("stockBo")
public class StockBoImpl implements StockBo {

	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Stock stock){
		stockDao.save(stock);
	}
	
	public void update(Stock stock){
		stockDao.update(stock);
	}
	
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}
