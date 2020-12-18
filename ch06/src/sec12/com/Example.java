package sec12.com; //클래스 구별 식별자역할, 패키지 이름은 소문자로 하는 것이 관례
/*
import sec12.com.mycompany.Car;
import sec12.com.mycompany.SportsCar;
import sec12.com.yourcompany.Computer;
*/
import sec12.com.yourcompany.Car;

import sec12.com.mycompany.*; //이 패키지 안에 있는거 다 쓸 수 있음
import sec12.com.yourcompany.Computer;

public class Example {

	public static void main(String[] args) {
		System.out.println("나 실행돼요~");

		Car car = new Car(); //같은 패키지 안에 있는건 쓸 수 있지만, 다른 패키지에 있는건 그냥 못씀. import 필요
		SportsCar sc = new SportsCar();
		Computer myCom = new Computer();
		
		//똑같은 이름 클래스이름 있으면 한 쪽은 풀네임으로
		sec12.com.yourcompany.Car yourCar = new sec12.com.yourcompany.Car(); 
		
	}

}
