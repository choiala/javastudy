package sec06;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //���� �� ������ ������ �⺻������ ȣ�� ��
							   //��ü�� �� �� ����� ��
		
		System.out.println(myCar.company); //myCar�� ������ �ִ� company ȣ��
		System.out.println(myCar.speed);
		System.out.println(myCar.tire);
		System.out.println(myCar.navi);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
	}

}
