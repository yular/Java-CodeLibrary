package com.yulartech.templateDao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.yulartech.templateDomain.Stock;

@Repository("stockDao")
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		List list = getHibernateTemplate().find(
                      "from Stock where stockCode=?",stockCode
                );
		return (Stock)list.get(0);
	}

}
