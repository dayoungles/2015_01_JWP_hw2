package basic;

import org.joda.time.DateTime;

public class Jodatime {
		DateTime datet;
	public void setTime(String date){
		datet = new DateTime(date);
	}
	
	public String getDay(){
		return findDay(datet.getDayOfWeek());
	}
	
	
	
	private String findDay(int date){
		String day=null;
		switch(date){
			case 0:
				day = "Sunday";
				break;
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Sunday";
				break;
			}
		return day;
	}
}
