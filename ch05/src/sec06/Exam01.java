package sec06;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] scores = {95, 80, 91, 78, 99};
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//int[] scores2; //변수를 선언만 했다고 변수가 생성되지 않음.
		//System.out.println(scores2[0]); //NullPointException
		int[] scores2 = null;
		if(scores2 == null) {
			scores2 = new int[] {95, 80, 91, 78, 99}; //new : 객체를 새롭게 만들어라
		}
		System.out.println(scores2[0]);	
		
		//메소드 호출(메소드 블록을 실행해라)
		String[] arr = {"자바", "파이썬", "자바스크립트"};
		printNames(arr);
		
		printNames(new String[]{"자바2", "파이썬2", "자바스크립트2"});
	}
	
	//메소드 선언(정의)
	public static void printNames(String[] names) { //메소드 호출 부분과 타입만 맞으면 됨, arr -> names 번지복사
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
