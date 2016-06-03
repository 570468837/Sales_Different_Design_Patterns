package MVC;

import Layered.SalesBusinessLogic;
import OO.SalesManager;

public class SalesModel {
	private static SalesBusinessLogic sbl;
	
	public SalesModel(){
		sbl = SalesBusinessLogic.getInstance();
	}
	
	public SalesManager getSalesManager(){
		return new SalesManager();
	}
}
