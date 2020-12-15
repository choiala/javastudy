package sec04;

public class Exam03 {

	public static void main(String[] args) {
		// 논리 연산자 (논리 합, 논리 곱)
		
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = var1 && var2; //논리곱, 둘 다 true여야 true
		boolean var4 = var1 || var2; //논리합, 하나만 true여도 true
		
		int var5 = 11;
		int var6 = 4;
		boolean var7 = (var5 % var6 == 0) || (var5 >= 0);
		System.out.println("var7:" + var7);
		

	}

}
