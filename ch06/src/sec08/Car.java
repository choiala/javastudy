package sec08;

public class Car {
	//Field	
	private int speed;
	
	//Constructor
	Car(){
		setSpeed(0);
	}
	
	
	//Method
	public void setSpeed(int speed) { //set : �����Ѵ�, int speed : ������ ��
		if(speed<0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
		
	}
	
	public void run(int value) {
		//speed = value; //������ �����Ͱ� ����� �� ���� ex)speed�� ����X
		setSpeed(value);
	}
}
