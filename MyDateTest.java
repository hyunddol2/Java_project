package question4;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1=new MyDate(30, 0, 2000);		// month ��ȿX
		MyDate date2=new MyDate(25, 15, 1999);		// month ��ȿX
		MyDate date3=new MyDate(33, 5, 2001);		// day ��ȿX
		MyDate date4=new MyDate(24, 5, 1998);		// ��ȿO	
		MyDate date5=new MyDate(31, 11, 2021);		// day ��ȿX
		MyDate date6=new MyDate(17, 11, 1923);		// ��ȿO	
		MyDate date7=new MyDate(31, 2, 2021);		// day ��ȿX
		MyDate date8=new MyDate(28, 2, 1923);		// ��ȿO	
		
		System.out.println("\n <�Էµ� ��¥>");
		System.out.println(date1.getYear()+"�� " + date1.getMonth()+"�� "+date1.getDay()+"��");
		System.out.println(date2.getYear()+"�� " + date2.getMonth()+"�� "+date2.getDay()+"��");
		System.out.println(date3.getYear()+"�� " + date3.getMonth()+"�� "+date3.getDay()+"��");
		System.out.println(date4.getYear()+"�� " + date4.getMonth()+"�� "+date4.getDay()+"��");
		System.out.println(date5.getYear()+"�� " + date5.getMonth()+"�� "+date5.getDay()+"��");
		System.out.println(date6.getYear()+"�� " + date6.getMonth()+"�� "+date6.getDay()+"��");
		System.out.println(date7.getYear()+"�� " + date7.getMonth()+"�� "+date7.getDay()+"��");
		System.out.println(date8.getYear()+"�� " + date8.getMonth()+"�� "+date8.getDay()+"��");
		
		
	}

}