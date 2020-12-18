package sec07;

public class Example03 {

	public static void main(String[] args) {
		
		//Korean k1 = new Korean(); //객체 생성 불가, 생성자를 작성해서 기본생성자 생성 X
		Korean k1 = new Korean("홍길동","123456-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("감자바","123457-1234567");

	}

}
