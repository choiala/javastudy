package sec09;

public class Calculator {
	//Field
	String company;
	static double pi = 3.14159; //��ü���� ������ ���� static �ٿ��� ��
	double memory;
	
	//Constructor
	
	//Method
	static double circleArea(double r) {
		double area = r * r *pi; //static�� this. ����
		return area;
	}
	
	double circleArea2(double r) {
		double area = r * r *this.pi;
		return area;
	}
	
	void setMemory(double r) { //memory������ ��ü�� ����� ���� ����ؾ���
		double result = circleArea(r);
		this.memory = result;
	}
	
	static void method1() { //�ʵ� ��� ����, �޼ҵ� ��� ���� -> static �ٿ���
		String name = "ȫ�浿";
		int round = 3;
		System.out.println("������ �߿���");
	}
	
	void method2() {
		//String company = "�Ｚ"; //������
		this.company = "�Ｚ";
		this.setMemory(10);
		System.out.println("������ �߿���");
	}
	
}
