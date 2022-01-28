package com.mouritech.onetooneexample;

import com.mouritech.onetooneexample.dao.StockDao;
import com.mouritech.onetooneexample.model.Stock;
import com.mouritech.onetooneexample.model.Stock_Details;
public class OneToOneExample {

	public static void main(String[] args) {
		
		Stock stk = new Stock(1L, 100L, "SBI");
		Stock_Details stkdetails = new Stock_Details( "Google", "GoodCompany", "Good", "10/05/1998");
		stk.setStockDetails(stkdetails);
		
	StockDao stkDao = new StockDao();
		stkDao.saveStock(stk);

	}

}
