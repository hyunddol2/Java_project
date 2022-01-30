package cooperation_02;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentJames=new Student("James", 10000);
		Student studentTomas=new Student("Tomas", 5000);
		Student studentSarah=new Student("Sarah", 15000);
		
		System.out.println("<Å¾½Â Àü>");
		studentJames.showInfo();
		studentTomas.showInfo();
		studentSarah.showInfo();
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		
		Subway subway2=new Subway(2);
		studentTomas.takeSubway(subway2);
		
		studentSarah.takeBus(bus100);
		studentSarah.takeSubway(subway2);
		
		System.out.println();
		System.out.println("<Å¾½Â ÈÄ>");
		studentJames.showInfo();
		studentTomas.showInfo();
		studentSarah.showInfo();
		System.out.println();
		bus100.showInfo();
		subway2.showInfo();
		
	}
}
