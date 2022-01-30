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
		System.out.println("지하철 "+ lineNumber + "호선의 승객은 "+ passengerCount+ "명이고, 수입은 " + money + "원입니다.");
	}
}
