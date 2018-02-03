package behaveObserverPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class StockData {
	
	public static Integer[] prices={10, 20, 30};
	public static String[] samp={"MSFT", "GOOG", "IBM"};
	
	public static ArrayList<Stock> getNext(){
		ArrayList<Stock> q=new ArrayList<Stock>();
		for(int i=0;i<samp.length;i++){
			Stock s=new Stock();
			s.code=samp[i];
			s.price=prices[i];
			q.add(s);
		}
		return q;
		
	}

}
