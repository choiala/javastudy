package sec03;

public class Exam01 {

	public static void main(String[] args) {
		// ������ ���غ���
		int var1 = 10;
		int var2 = 100;
		int var3 = 100;
		
		System.out.println(var1 == var2); //false 
		System.out.println(var1 == var3); //false
		System.out.println(var2 == var3); //true
		
		int[] var4 = {10};
		int[] var5 = {100};
		int[] var6 = {100}; 
		int[] var7 = var5; //���� �ּ� �� ���� ���� �迭 �� ���� ��

		System.out.println(var4 == var5); //false 
		System.out.println(var4 == var6); //false
		System.out.println(var5 == var6); //false, var5�� var6�� �ٸ� ����
		System.out.println(var5 == var7); //true
		
	}

}
