package question4;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(dayIsValid(day, month)) {
			this.day=day;
			System.out.println("유효한 day입니다.");
		}
		else {
			System.out.println("유효하지 않은 day입니다.");
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(monthIsValid(month)) {
			this.month=month;
			System.out.println("유효한 month입니다.");
		}
		else {
			System.out.println("유효하지 않은 month입니다.");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	
	public boolean monthIsValid(int month) {
		if(month>=1 && month<=12)
			return true;
		else
			return false;
	}
	
	public boolean dayIsValid(int day, int month) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(day>=1 && day<=31) {
					return true ;
				}
				else {
					return false;
				}
				
			case 4: case 6: case 9: case 11:
				if(day>=1 && day<=30) {
					return true;
				}
				else{
					return false;
				}
				
			case 2:
				if(day>=1 && day<=29) {
					return true;
				}
				else{
					return false;
				}
			default: return false;
			}
		}
}