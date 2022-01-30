package question4;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1=new MyDate(30, 0, 2000);		// month 유효X
		MyDate date2=new MyDate(25, 15, 1999);		// month 유효X
		MyDate date3=new MyDate(33, 5, 2001);		// day 유효X
		MyDate date4=new MyDate(24, 5, 1998);		// 유효O	
		MyDate date5=new MyDate(31, 11, 2021);		// day 유효X
		MyDate date6=new MyDate(17, 11, 1923);		// 유효O	
		MyDate date7=new MyDate(31, 2, 2021);		// day 유효X
		MyDate date8=new MyDate(28, 2, 1923);		// 유효O	
		
		System.out.println("\n <입력된 날짜>");
		System.out.println(date1.getYear()+"년 " + date1.getMonth()+"월 "+date1.getDay()+"일");
		System.out.println(date2.getYear()+"년 " + date2.getMonth()+"월 "+date2.getDay()+"일");
		System.out.println(date3.getYear()+"년 " + date3.getMonth()+"월 "+date3.getDay()+"일");
		System.out.println(date4.getYear()+"년 " + date4.getMonth()+"월 "+date4.getDay()+"일");
		System.out.println(date5.getYear()+"년 " + date5.getMonth()+"월 "+date5.getDay()+"일");
		System.out.println(date6.getYear()+"년 " + date6.getMonth()+"월 "+date6.getDay()+"일");
		System.out.println(date7.getYear()+"년 " + date7.getMonth()+"월 "+date7.getDay()+"일");
		System.out.println(date8.getYear()+"년 " + date8.getMonth()+"월 "+date8.getDay()+"일");
		
		
	}

}