package sec03;

public class Exam01 {

	public static void main(String[] args) {
		//Ÿ�� ��ȯ
		//�ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		short var2 = var1; // var1�� short��
		int var3 = var1;
		long var4 = var1;
		
		//���� Ÿ�Ժ�ȯ : ���� ���� ������ �Ǹ鼭 ��ȯ�� �Ǿ�� ��.
		long var5 = 200;
		//int var6 = var5; //var5�� Ÿ���� long�� var6�� Ÿ���� int���� �� Ŀ�� ���� �Ұ�, ū �׸��� ���� �׸��� ����´�!
		int var6 = (int) var5; //long var5�� intŸ������ ������ �߶� ���κи� var6�� �־�� -> ���� Ÿ�Ժ�ȯ
		short var7 = (short)var5;
		byte var8 = (byte) var5;
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8); //byte�� 200ǥ�� �Ұ��� �����Ⱚ ���
		
		// ���ڿ��� ���� �Ǵ� �Ǽ��� ��ȯ
		String var9 = "300";
		int var10 = Integer.parseInt(var9);
		
		String var11 = "300.7";
		double var12 = Double.parseDouble(var11);
	}

}
