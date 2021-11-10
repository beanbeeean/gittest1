package ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MBCNews implements WriteArticle{

	public String printDate() {
		
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		return formater.format(Calendar.getInstance().getTime());
	}

	@Override
	public void printArticle(String article) {

		System.out.println(" === MBC 뉴스 ===");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("날짜 : " + printDate());
	}
	
	
}
