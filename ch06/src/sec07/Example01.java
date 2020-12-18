package sec07;

public class Example01 {

	public static void main(String[] args) {
		
		Car car1 = new Car(); 
		System.out.println(car1.company);
		//                 매개값
		Car car2 = new Car("삼성"); //public Car(String company) 호출
									 //설계도 상엔 "현대"이지만 호출할 때, 객체를 생성할 때 "삼성"넣음
		System.out.println(car2.company);
		
		Car myCar2 = new Car(60); //public Car(int speed) 호출
		//어떤 생성자를 이용할거라도 객체는 다 만들어짐
		
		Car car3 = new Car(100);
		System.out.println(car3.company);
		
		Car car4 = new Car("기아",30);
		Car car5 = new Car(30,"기아");
		
		//어떤 생성자를 만들 것인가는 내 몫
		
	}

}
