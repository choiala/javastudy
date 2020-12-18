package sec09;

public class Korean {
	//Field
	//정적 필드 : 한국사람이라면 공통된 데이터
	static String nation = "한국"; 
	//인스턴스 필드 : 객체마다 가지고 있는 필드
	String name;
	
	//Constructor
	
	//Method
	static String getNation() { //객체 없이 호출 가능하게끔 블록 안의 내용이 정적 필드 또는 정적 메소드만으로 구성  
		//인스턴스 멤버 하나도 안쓰면 static 붙여라
		return nation;
	}
	
	static String changeNation() {
		String nation = getNation();
		Korean.nation = "대한민국";
		//age = 10; //객체가 있어야 호출 가능
		return nation;
	}
	
	String getName() {
		//인스턴스 필드 또는 인스턴스 메소드 호출이 포함되어있으면
		//메소드는 인스턴스 메소드여야 한다.
		return name;
	}
}
