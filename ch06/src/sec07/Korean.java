package sec07;

public class Korean {
	String nation = "���ѹα�";
	String name; //� �̸� ������ �𸣴ϱ� �����
	String ssn;
	
	//Korean k1 = new Korean("ȫ�浿","123456-1234567")
	//�����ڸ� �ϳ��� �ۼ��ϸ� �⺻ �����ڴ� �������� ����, Korean k1 = new Korean(); �Ұ���
	public Korean(String name, String ssn) { //��ü�� ���� �ִ� ������ �����ڰ�
		this.name = name;
		this.ssn = ssn;
	}
	
	//���� ����
	/* 
	public Korean(String n, String s) { //��ü�� ���� �ִ� ������ �����ڰ�
		name = n;
		ssn = s;
	}
	*/
}
