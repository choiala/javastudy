package sec11;

public class Korean {
	//Field
	static final String NATION = "한국"; //값 바꿀 수 없도록 final 붙임
										//static final은 대묹자로 : 상수(불변의 값)
	final String ssn; //주민등록번호는 사람마다 있지만 변경 불가
	
	//Constructor
	Korean(String ssn){ //한 번은 받아서 저장할 수 있다
		this.ssn = ssn; 
	}
	
	//Method
}
