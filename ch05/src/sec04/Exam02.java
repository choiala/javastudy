package sec04;

public class Exam02 {
	public static void main(String[] args) {
		
		String var1 = "123456-1234567";
		int num1 = var1.length(); //var1이 가진 기능 중에서 length()기능을 쓰겠다. 메소드 호출
		                         //.length() : var1의 번지로 가서 저장된 문자열의 길이가져와
		System.out.println(num1);
		
		String var2 = null;		
		//if(var2!=null) {
			int num2 = var2.length(); //null인 상태에서 length() 사용 불가 : NullPointException
									  //해결 방법 : 값을 넣어 주던지, 윗 줄 처럼 if문 쓰던지
			System.out.println(num2);
		//}
		
	}

}
