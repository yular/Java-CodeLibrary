package com.yulartech.templateDao;

import com.yulartech.templateDomain.Stock;

public interface StockBo {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
	
}
