package cooperation_02;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		this.money-=1000;
		bus.take();		
	}
	
	public void takeSubway(Subway subway) {
		this.money-=1500;
		subway.take();
	}
	public void showInfo() {
		System.out.println(studentName+"("+grade+" �г�) ���� ���� ���� "+ money+"���Դϴ�.");
	}

	
	// �� �ڵ忡���� grade ���� �ǹ� ����..
}
