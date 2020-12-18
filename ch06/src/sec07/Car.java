package sec07;

public class Car {
	//Field
	String company = "현대"; //배열처럼 기본값으로 0의 의미의 값이 들어감 
	int speed;
	Tire tire = new Tire(); //Tire 객체를 만들어서 tire변수에 번지를 넣는다
	boolean navi = true;
	
	//Constructor
	//생성자 블록 : 클래스 이름과 똑같아야함. {}가 반드시 붙어있어야 함
	//생성자 오버로딩 : 생성자 여러개 만드는 것. 매개변수의 타입, 갯수, 순서 달라야함
	public Car() {
		System.out.println("Car() 실행됨");		
	} 
	
	//객체 초기화 코드 : 생성자가 값을 바꾸게끔
	//        매개변수(argument) : 생성자를 호출할 때 값이 결정 됨
	public Car(String company) { //필드의 company와 다름
		System.out.println("Car(String company) 실행됨");		
		this.company = company; //this는 현재 객체가 참조하는 변수 / this.company는 필드의 String company
	}
	
	public Car(int speed) {
		System.out.println("Car(int speed) 실행됨");		
		this.speed = speed; //this.speed에 받은  speed값을 저장한다.
	}
	
	public Car(String company, int speed) { 
		System.out.println("Car(String company, int speed) 실행됨");		
		this.company = company;
		this.speed = speed; 
	}
	
	public Car(int speed, String company) { //오버로딩 가능: 매개변수의 순서가 틀려서
		System.out.println("Car(int speed, String company) 실행됨");		
		this.company = company;
		this.speed = speed;
	}
	
	
	
	//Method
}
