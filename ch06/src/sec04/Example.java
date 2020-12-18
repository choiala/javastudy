package sec04;

//실행을 위한 클래스
public class Example {
	
	//메인메소드가 들어가있으면 실행용
	public static void main(String[] args) {
		//car변수 선언 : 위치정보 저장
		
		//Car 변수 선언
		Car myCar = null; //Car.class를 타입으로 지정
		//Car 객체 생성
		myCar = new Car(); //heap에 객체 만들어서 myCar로 받기
		
		Car mysonCar = myCar; //같은 주소
		
		//Car변수 선언과 동시에 객체 생성
		Car yourCar = new Car();
		
		//메인이 끝나는 순간 myCar, yourCar는 사라짐
		//heap에 생성된 Car객체는 살아있음
		//자바는 객체를 누군가가 참조하지 않으면 (변수가 객체 참조 /객체가 객체 참조) 객체 제거함 → Garbage Collecter (JRE(JVM)가 함)
		//GC 실행 조건 : 메모리가 가득 차서 실행될 수 없을 때 / pc가 한가할 때 
		
		//Student 변수 선언과 동시에  Student 객체 생성
		Student s1 = new Student();
		Student s2 = new Student();
		
		//객체 비교
		System.out.println(myCar == yourCar); //번지 비교 false
		System.out.println(myCar == mysonCar); //true
		
		System.out.println(s1 == s2);
	}

}
