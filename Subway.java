package cooperation_02;

public class Subway {

	public int lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take() {
		passengerCount++;
		money+=1500;
	}
	
	public void showInfo() {
		System.out.println("����ö "+ lineNumber + "ȣ���� �°��� "+ passengerCount+ "���̰�, ������ " + money + "���Դϴ�.");
	}
}
