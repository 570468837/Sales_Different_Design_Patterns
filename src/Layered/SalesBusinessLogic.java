package Layered;

import OO.SalesManager;

public class SalesBusinessLogic {
	private static SalesBusinessLogic sbl;
	
	public static SalesBusinessLogic getInstance() {
		// TODO Auto-generated method stub
		if(sbl == null)
			sbl = new SalesBusinessLogic();
		return sbl;
	}
	
	public SalesManager getSalesManager(){
		return new SalesManager();
	}
}
