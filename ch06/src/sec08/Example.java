package sec08;

public class Example {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		//�޼ҵ� ȣ��
		myCalc.print();
		myCalc.print("�߿� ���߿�");
		myCalc.print("�����",-7);
		
		byte b1 = 3;
		int result = myCalc.plus(b1, 5); //����� �ޱ� // byteŸ���� �־ ��(int���� �����ϱ�)
		System.out.println("result:" + result);
		
		long var1 = 3;
		int result00 = myCalc.plus((int)var1, 5);//long �������� ���� Ÿ�Ժ�ȯ �ʿ�
		
		String result2 = myCalc.join("����", "000");
		System.out.println("result2:" + result2);
		
		int[] scores = {90, 80, 90};
		int result3 = myCalc.sum(scores);
		System.out.println(result3);
		
		//int result4 = myCalc.sum2(scores);
		int result4 = myCalc.sum2(90, 80, 90); //�޼ҵ� �Ű������� ...�� �� �ְ������� �� �� ���� �� �迭�� �������
		System.out.println(result4);
		
		Car myCar = new Car();
		//myCar.speed = -10; //private �پ speed �� �� ����
		myCar.setSpeed(-10); //���������� ���ؼ� ȣ���ؾ���
		myCar.run(100); 
		
		

	}

}
