package sec04;

public class Exam01 {

	public static void main(String[] args) {
		// 산술 연산(+, -, *, /) 시 주의할 점
		
		//long이 아닌 정수 변수의 연산 결과는 int 값이다.
		byte var1 = 1;
		byte var2 = 2;
		//byte var3 = var1 + var2; //err, var1, var2의 값을 javac.exe에선 모름 
		int var3 = var1 + var2;
		byte var4 = 1 + 2;
		
		//long 변수의 연산의 결과는 long이다.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		
		//정수의 나눗셈은 정수다.
		int var8 = 11;
		int var9 = 4;
		double var10 = var8 / var9; //몫 2.0, 위에서 이미 2.0의 결과가 나오는데 그 결과가 double에 저장됨
		System.out.println(var10);
		
		//소수점 이하는 값을 얻고 싶을 때에는 실수 연산식으로 변경
		double var11 = 1.0 * var8 / var9; //1.0 곱하면 실수됨, 한 쪽이 실수면 다른 쪽도 실수 됨
		//double var11 = (double)var8 / var9;
		System.out.println(var11);
		
		//나머지 연산자
		int var12 = var8 % var9;
		System.out.println(var12);
	}

}
