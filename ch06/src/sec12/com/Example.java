package sec12.com; //Ŭ���� ���� �ĺ��ڿ���, ��Ű�� �̸��� �ҹ��ڷ� �ϴ� ���� ����
/*
import sec12.com.mycompany.Car;
import sec12.com.mycompany.SportsCar;
import sec12.com.yourcompany.Computer;
*/
import sec12.com.yourcompany.Car;

import sec12.com.mycompany.*; //�� ��Ű�� �ȿ� �ִ°� �� �� �� ����
import sec12.com.yourcompany.Computer;

public class Example {

	public static void main(String[] args) {
		System.out.println("�� ����ſ�~");

		Car car = new Car(); //���� ��Ű�� �ȿ� �ִ°� �� �� ������, �ٸ� ��Ű���� �ִ°� �׳� ����. import �ʿ�
		SportsCar sc = new SportsCar();
		Computer myCom = new Computer();
		
		//�Ȱ��� �̸� Ŭ�����̸� ������ �� ���� Ǯ��������
		sec12.com.yourcompany.Car yourCar = new sec12.com.yourcompany.Car(); 
		
	}

}
