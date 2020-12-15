package sec03;

public class Exam01 {

	public static void main(String[] args) {
		//타입 변환
		//자동 타입 변환
		byte var1 = 10;
		short var2 = var1; // var1이 short로
		int var3 = var1;
		long var4 = var1;
		
		//강제 타입변환 : 원래 값이 보존이 되면서 변환이 되어야 함.
		long var5 = 200;
		//int var6 = var5; //var5의 타입인 long이 var6의 타입인 int보다 더 커서 저장 불가, 큰 그릇을 작은 그릇에 못담는다!
		int var6 = (int) var5; //long var5를 int타입으로 적당히 잘라서 끝부분만 var6에 넣어라 -> 강제 타입변환
		short var7 = (short)var5;
		byte var8 = (byte) var5;
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8); //byte는 200표현 불가로 쓰레기값 출력
		
		// 문자열을 정수 또는 실수로 변환
		String var9 = "300";
		int var10 = Integer.parseInt(var9);
		
		String var11 = "300.7";
		double var12 = Double.parseDouble(var11);
	}

}
