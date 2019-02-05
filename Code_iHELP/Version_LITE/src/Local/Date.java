package Local;

import java.io.Serializable;
import java.util.Calendar;

public class Date  implements Serializable{
	private int day ;
	private int month ;
	private int year ;
	static Calendar cal = Calendar.getInstance();
    public Date(){
    	
    	day = cal.get(Calendar.DAY_OF_MONTH);
    	month = cal.get(Calendar.MONTH)+1;
    	year = cal.get(Calendar.YEAR);
    	
    	
    	
    }
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return ""+day+"/"+month+"/"+year;
		
		
	}

}
