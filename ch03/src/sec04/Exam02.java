package sec04;

public class Exam02 {

	public static void main(String[] args) {
		// 비교 연산자
		
		//1. 숫자 비교
		int var1 = 3;
		int var2 = 4;
		boolean var3 = var1 == var2; // != 
		System.out.println("var3:" + var3);
		
		//2. 문자열 비교
		String var4 = "java";
		String var5 = "Java";
		boolean var6 = var4.equals(var5); // 같은가? var4 == var5;는 될 때도 있고, 안될 때도 있음
		boolean var7 = !var4.equals(var5);// 다른가?
		
		//3. 대소 비교
		int var8 = 3;
		int var9 = 5;
		boolean var10 = var8 >= var9;
		boolean var11 = !(var8 >= var9);
		
	}

}
