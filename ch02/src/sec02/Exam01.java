package sec02;

public class Exam01 {

	public static void main(String[] args) {
		// ���� Ÿ��(�ڷ���)�� ������ �˾ƺ���!
		byte var1 = 10; // byte�� ������ -128 ~ 127�����̹Ƿ�, 200 ������ err
		short var2 = 10;
		int var3 = 10;
		long var4 = 5000000000L; //�ڹٴ� �⺻������ ���ڴ� int�� �����ϴµ�, int������ �ʰ��ϴ� ���� �������� �ڿ� L�� �ٿ��� ��
		
		// �Ǽ�(�Ҽ���) Ÿ���� ����
		float var5 = 3.112345671324567f; // �Ǽ��� �⺻������ double�� ������. floatŸ���� ���� ������ �ڿ� f�ٿ��� ��
		double var6 = 3.14123456712345; // float���� ������ �Ҽ� ǥ�� ����
		System.out.println("var5:" + var5);
		System.out.println("var6:" + var6);
		
		// ���� Ÿ��
		char var7 = 'A'; //''�ȿ��� �� ���ڸ� ��. �ѱ۵� �� ���ڸ�
		System.out.println("var7:" + var7);
		
		// ���ڿ� Ÿ��
		String var8 = "ABC"; //���� Ÿ���� �� �տ� �빮�ڷ� ����, �ҹ��ڷ� �����ϴ� ģ������ �ҹ��ڷ� ����
		System.out.println("var8:" + var8);
		
		// �� Ÿ��(true, false)
		boolean var9 = true;
		boolean var10 = false;
	}

}
