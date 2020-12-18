package sec08;

public class Car {
	//Field	
	private int speed;
	
	//Constructor
	Car(){
		setSpeed(0);
	}
	
	
	//Method
	public void setSpeed(int speed) { //set : 변경한다, int speed : 변경할 값
		if(speed<0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
		
	}
	
	public void run(int value) {
		//speed = value; //엉뚱한 데이터가 저장될 수 있음 ex)speed는 음수X
		setSpeed(value);
	}
}
