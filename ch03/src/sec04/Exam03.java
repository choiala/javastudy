package sec04;

public class Exam03 {

	public static void main(String[] args) {
		// �� ������ (�� ��, �� ��)
		
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = var1 && var2; //����, �� �� true���� true
		boolean var4 = var1 || var2; //����, �ϳ��� true���� true
		
		int var5 = 11;
		int var6 = 4;
		boolean var7 = (var5 % var6 == 0) || (var5 >= 0);
		System.out.println("var7:" + var7);
		

	}

}
