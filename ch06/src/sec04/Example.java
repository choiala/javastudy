package sec04;

//������ ���� Ŭ����
public class Example {
	
	//���θ޼ҵ尡 �������� �����
	public static void main(String[] args) {
		//car���� ���� : ��ġ���� ����
		
		//Car ���� ����
		Car myCar = null; //Car.class�� Ÿ������ ����
		//Car ��ü ����
		myCar = new Car(); //heap�� ��ü ���� myCar�� �ޱ�
		
		Car mysonCar = myCar; //���� �ּ�
		
		//Car���� ����� ���ÿ� ��ü ����
		Car yourCar = new Car();
		
		//������ ������ ���� myCar, yourCar�� �����
		//heap�� ������ Car��ü�� �������
		//�ڹٴ� ��ü�� �������� �������� ������ (������ ��ü ���� /��ü�� ��ü ����) ��ü ������ �� Garbage Collecter (JRE(JVM)�� ��)
		//GC ���� ���� : �޸𸮰� ���� ���� ����� �� ���� �� / pc�� �Ѱ��� �� 
		
		//Student ���� ����� ���ÿ�  Student ��ü ����
		Student s1 = new Student();
		Student s2 = new Student();
		
		//��ü ��
		System.out.println(myCar == yourCar); //���� �� false
		System.out.println(myCar == mysonCar); //true
		
		System.out.println(s1 == s2);
	}

}
