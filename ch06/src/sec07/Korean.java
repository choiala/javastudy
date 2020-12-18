package sec07;

public class Korean {
	String nation = "대한민국";
	String name; //어떤 이름 가질지 모르니까 비워둠
	String ssn;
	
	//Korean k1 = new Korean("홍길동","123456-1234567")
	//생성자를 하나라도 작성하면 기본 생성자는 생성되지 않음, Korean k1 = new Korean(); 불가능
	public Korean(String name, String ssn) { //객체에 값을 넣는 역할을 생성자가
		this.name = name;
		this.ssn = ssn;
	}
	
	//위와 같음
	/* 
	public Korean(String n, String s) { //객체에 값을 넣는 역할을 생성자가
		name = n;
		ssn = s;
	}
	*/
}
