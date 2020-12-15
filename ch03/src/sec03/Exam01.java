package sec03;

public class Exam01 {

	public static void main(String[] args) {
		//단항 연산자(++, --, +=, !)
		
		// 증감 연산자
		int var1 = 1;
		//1씩 증가
		var1++; // ++var; 과 같음, ++는 파이썬에서 지원 x
		++var1;
		System.out.println(var1);
		
		//1씩 감소
		var1--; // ++var; 과 같음, ++는 파이썬에서 지원 x
		--var1;
		System.out.println(var1);
		
		//다른 연산자와 같이 사용할 경우 주의
		int var2 = 1;
		int var3 = var2++ + 5; //변수 기준으로 ++가 앞에 나오면 ++연산 후 계산, ++가 뒤에 나오면 연산 후 ++ 계산 
		System.out.println(var3);
		
		int var4 = (var2++) + 5; //괄호도 무소용, 이렇게 쓰지 말아라 / 단독으로만 사용하라 ex) var++;
 		System.out.println(var4);
 		
 		//원래 변수의 값을 변경하는 연산식
 		int var5 = 1;
 		var5 += 3; // var5 = var5 + 3;
 		var5 -= 3; // var5 = var5 - 3;
 		var5 *= 3; // var5 = var5 * 3;
 		var5 /= 3; // var5 = var5 / 3;
 		
 		//논리 값을 부정하는 연산식
 		boolean var6 = false;
 		boolean var7 = !var6;
 		
	}

}
