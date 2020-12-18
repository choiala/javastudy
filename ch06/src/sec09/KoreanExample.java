package sec09;

public class KoreanExample {

	public static void main(String[] args) {
		//정적 필드 읽기
		System.out.println(Korean.nation);
		
		//정적 필드 수정
		Korean.nation = "대한민국";
		System.out.println(Korean.nation);
		
		//메소드 호출
		//Korean.getNation(); //클래스로 접근할 수 없음
		//Korean k1 = new Korean();
		//k1.getNation(); //nation이 Static이라 객체로 호출해야함
		System.out.println(Korean.getNation()); //static이라 Koeran. 으로 호출
		//System.out.println(Korean.getName()); //객체 안만들어서 에러
		
		Korean k1 = new Korean();
		k1.name = "홍길동";
		System.out.println(k1.getName());

	}

}
