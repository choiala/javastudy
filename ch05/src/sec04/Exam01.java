package sec04;

public class Exam01 {

	public static void main(String[] args) {
		
		//�⺻Ÿ�� ������ null �Ұ�, ���� ���� ��
		//null�� �ǹ� : ���� �ּҸ� ������ ���� �ʴ�.
		//int var1 = null;
		//double var2 = null;
		//boolean var3 = null;
		
		String var4 = null;
		int[] var5 = null;
		
		//null ��
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 == null); //false
		System.out.println(var6 != null); //true
		System.out.println(var7 == null); //true
		System.out.println(var7 != null); //false
	}

}
