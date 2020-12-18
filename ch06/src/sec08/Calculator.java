package sec08;

public class Calculator {
	//Field
	
	//Constructor
	Calculator(){
		
	}
	
	//Method
	//메소드는 클래스 이름과 무조건 달라야함
	//리턴되는 값의 타입을 앞에 붙여야 함 ex)void : 리턴값 없음 실행되고 끝
	void print() {
		for(int i=0; i<5; i++) {
			System.out.println("기본 내용을 출력합니다.");
			if(i == 2) {
				//break;
				return; // void라 결과값이 없으니 종료
			}
		}
		System.out.println("프린트 완료");
	}
		
	
	void print(String message) {
		System.out.println(message);
	}
	
	void print(String message, int temp) {
		System.out.println(message);
		System.out.println("온도 : " + temp);
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result; //값을 호출한 애한테 돌려주겠다
	}
	
	String join(String s1, String s2) {
		String result = s1 + "-" + s2;
		return result;
	}
	
	//배열을 매개값으로 받아서 배열안에 모든 수를 더해서 리턴
	int sum(int[] arr){ 
		int sum = 0;
		for(int value : arr){
			sum += value;
		}
		return sum;
	}
	
	int sum2(int... arr){ //... : 몇개인지 모르겠다 
		int sum = 0;
		if(arr == null) {
			return 0;
		}
		for(int value : arr){
			sum += value;
		}
		return sum;
	}
}
