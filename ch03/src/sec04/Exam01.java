package sec04;

public class Exam01 {

	public static void main(String[] args) {
		// ��� ����(+, -, *, /) �� ������ ��
		
		//long�� �ƴ� ���� ������ ���� ����� int ���̴�.
		byte var1 = 1;
		byte var2 = 2;
		//byte var3 = var1 + var2; //err, var1, var2�� ���� javac.exe���� �� 
		int var3 = var1 + var2;
		byte var4 = 1 + 2;
		
		//long ������ ������ ����� long�̴�.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		//������ �������� ������.
		int var8 = 11;
		int var9 = 4;
		double var10 = var8 / var9; //�� 2.0, ������ �̹� 2.0�� ����� �����µ� �� ����� double�� �����
		System.out.println(var10);
		
		//�Ҽ��� ���ϴ� ���� ��� ���� ������ �Ǽ� ��������� ����
		double var11 = 1.0 * var8 / var9; //1.0 ���ϸ� �Ǽ���, �� ���� �Ǽ��� �ٸ� �ʵ� �Ǽ� ��
		//double var11 = (double)var8 / var9;
		System.out.println(var11);
		
		//������ ������
		int var12 = var8 % var9;
		System.out.println(var12);
	}

}
