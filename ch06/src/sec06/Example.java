package sec06;

public class Example {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //실행 시 생성자 없으면 기본적으로 호출 됨
							   //객체를 한 번 만들면 끝
		
		System.out.println(myCar.company); //myCar가 가지고 있는 company 호출
		System.out.println(myCar.speed);
		System.out.println(myCar.tire);
		System.out.println(myCar.navi);
		
		myCar.speed = 100;
		System.out.println(myCar.speed);
	}

}
