package sec04;

public class Exam01 {

	public static void main(String[] args) {
		
		//기본타입 변수는 null 불가, 값이 들어가야 함
		//null의 의미 : 아직 주소를 가지고 있지 않다.
		//int var1 = null;
		//double var2 = null;
		//boolean var3 = null;
		
		String var4 = null;
		int[] var5 = null;
		
		//null 비교
		String var6 = "data";
		String var7 = null;
		System.out.println(var6 == null); //false
		System.out.println(var6 != null); //true
		System.out.println(var7 == null); //true
		System.out.println(var7 != null); //false
	}

}
