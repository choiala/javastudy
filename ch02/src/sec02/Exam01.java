package sec02;

public class Exam01 {

	public static void main(String[] args) {
		// 정수 타입(자료형)의 종류를 알아보자!
		byte var1 = 10; // byte의 범위가 -128 ~ 127까지이므로, 200 넣으면 err
		short var2 = 10;
		int var3 = 10;
		long var4 = 5000000000L; //자바는 기본적으로 숫자는 int로 가정하는데, int범위를 초과하는 값을 넣으려면 뒤에 L을 붙여야 함
		
		// 실수(소수점) 타입의 종류
		float var5 = 3.112345671324567f; // 실수는 기본적으로 double로 가정함. float타입을 쓰고 싶으면 뒤에 f붙여야 함
		double var6 = 3.14123456712345; // float보다 정밀한 소수 표현 가능
		System.out.println("var5:" + var5);
		System.out.println("var6:" + var6);
		
		// 문자 타입
		char var7 = 'A'; //''안에는 한 문자만 됨. 한글도 한 글자만
		System.out.println("var7:" + var7);
		
		// 문자열 타입
		String var8 = "ABC"; //참조 타입은 맨 앞에 대문자로 시작, 소문자로 시작하는 친구들인 소문자로 시작
		System.out.println("var8:" + var8);
		
		// 논리 타입(true, false)
		boolean var9 = true;
		boolean var10 = false;
	}

}
