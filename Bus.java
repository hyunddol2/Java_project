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
		System.out.println("버스 "+ busNumber + "번의 승객은 "+ passengerCount+ "명이고, 수입은 " + money + "원입니다.");
	}
}
