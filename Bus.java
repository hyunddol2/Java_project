package cooperation_02;

public class Bus {

	public int busNumber;
	public int passengerCount;
	public int money;
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take() {
		passengerCount++;
		money+=1000;
	}
	
	public void showInfo() {
		System.out.println("���� "+ busNumber + "���� �°��� "+ passengerCount+ "���̰�, ������ " + money + "���Դϴ�.");
	}
}
