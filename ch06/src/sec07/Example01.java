package sec07;

public class Example01 {

	public static void main(String[] args) {
		
		Car car1 = new Car(); 
		System.out.println(car1.company);
		//                 �Ű���
		Car car2 = new Car("�Ｚ"); //public Car(String company) ȣ��
									 //���赵 �� "����"������ ȣ���� ��, ��ü�� ������ �� "�Ｚ"����
		System.out.println(car2.company);
		
		Car myCar2 = new Car(60); //public Car(int speed) ȣ��
		//� �����ڸ� �̿��ҰŶ� ��ü�� �� �������
		
		Car car3 = new Car(100);
		System.out.println(car3.company);
		
		Car car4 = new Car("���",30);
		Car car5 = new Car(30,"���");
		
		//� �����ڸ� ���� ���ΰ��� �� ��
		
	}

}
