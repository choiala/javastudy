package sec07;

public class Car2 {
	//Field
	String company; 
	int speed;
	Tire tire ; 
	boolean navi;
	
	//Constructor	
	public Car2() { //new Car(); �� ȣ��
		this(0, "����"); //�ڽ��� �� �ٸ� �����ڸ� ȣ���ض�.�� ������ �� �� �߿��� �Ű������� ���� ��� ȣ����� ���� �� public Car2(int speed, String company){} ����
						//�ߺ��� ���̱� ���ؼ� �ڽ��� �ٸ� ������ ȣ��
		/*
		this.company = "����"; 
		this.speed = 0;
		tire = new Tire(); 
		navi = true;	
		*/
	} 
	
	public Car2(String company) { //new Car("�Ｚ"); �� ȣ��
		this(0, company);
		/*
		this.company = company; 
		this.speed = 0;
		tire = new Tire(); 
		navi = true;	
		*/
	}
	
	public Car2(int speed) { //new Car(60); �� ȣ��
		this(speed, "����");
		/*
		this.company = "����"; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
		*/
	}
	
	public Car2(String company, int speed) { //new Car("�Ｚ", 60); �� ȣ��
		this(speed, company);
		/*
		this.company = company; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
		*/
	}
	
	public Car2(int speed, String company) {
		this.company = company; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
	}
	
	
	
	//Method
}
