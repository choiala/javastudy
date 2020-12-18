package sec07;

public class Car {
	//Field
	String company = "����"; //�迭ó�� �⺻������ 0�� �ǹ��� ���� �� 
	int speed;
	Tire tire = new Tire(); //Tire ��ü�� ���� tire������ ������ �ִ´�
	boolean navi = true;
	
	//Constructor
	//������ ��� : Ŭ���� �̸��� �Ȱ��ƾ���. {}�� �ݵ�� �پ��־�� ��
	//������ �����ε� : ������ ������ ����� ��. �Ű������� Ÿ��, ����, ���� �޶����
	public Car() {
		System.out.println("Car() �����");		
	} 
	
	//��ü �ʱ�ȭ �ڵ� : �����ڰ� ���� �ٲٰԲ�
	//        �Ű�����(argument) : �����ڸ� ȣ���� �� ���� ���� ��
	public Car(String company) { //�ʵ��� company�� �ٸ�
		System.out.println("Car(String company) �����");		
		this.company = company; //this�� ���� ��ü�� �����ϴ� ���� / this.company�� �ʵ��� String company
	}
	
	public Car(int speed) {
		System.out.println("Car(int speed) �����");		
		this.speed = speed; //this.speed�� ����  speed���� �����Ѵ�.
	}
	
	public Car(String company, int speed) { 
		System.out.println("Car(String company, int speed) �����");		
		this.company = company;
		this.speed = speed; 
	}
	
	public Car(int speed, String company) { //�����ε� ����: �Ű������� ������ Ʋ����
		System.out.println("Car(int speed, String company) �����");		
		this.company = company;
		this.speed = speed;
	}
	
	
	
	//Method
}
