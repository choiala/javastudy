package sec11;

public class Example {

	public static void main(String[] args) {
		//Korean.nation = "미국"; //final이라 값 바꿀 수 없음
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234657");
		System.out.println(k1.ssn);
		
		//k1.ssn = "654321-7654321"; //한 번 값이 부여되면 바꿀 수 없음

	}

}
