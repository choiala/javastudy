package sec09;

public class Korean {
	//Field
	//���� �ʵ� : �ѱ�����̶�� ����� ������
	static String nation = "�ѱ�"; 
	//�ν��Ͻ� �ʵ� : ��ü���� ������ �ִ� �ʵ�
	String name;
	
	//Constructor
	
	//Method
	static String getNation() { //��ü ���� ȣ�� �����ϰԲ� ��� ���� ������ ���� �ʵ� �Ǵ� ���� �޼ҵ常���� ����  
		//�ν��Ͻ� ��� �ϳ��� �Ⱦ��� static �ٿ���
		return nation;
	}
	
	static String changeNation() {
		String nation = getNation();
		Korean.nation = "���ѹα�";
		//age = 10; //��ü�� �־�� ȣ�� ����
		return nation;
	}
	
	String getName() {
		//�ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ȣ���� ���ԵǾ�������
		//�޼ҵ�� �ν��Ͻ� �޼ҵ忩�� �Ѵ�.
		return name;
	}
}
