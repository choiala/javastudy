package sec07;

public class Car2 {
	//Field
	String company; 
	int speed;
	Tire tire ; 
	boolean navi;
	
	//Constructor	
	public Car2() { //new Car(); 가 호출
		this(0, "현대"); //자신의 또 다른 생성자를 호출해라.→ 나머지 네 개 중에서 매개변수를 보고 어떤게 호출될지 결정 → public Car2(int speed, String company){} 실행
						//중복을 줄이기 위해서 자신의 다른 생성자 호출
		/*
		this.company = "현대"; 
		this.speed = 0;
		tire = new Tire(); 
		navi = true;	
		*/
	} 
	
	public Car2(String company) { //new Car("삼성"); 가 호출
		this(0, company);
		/*
		this.company = company; 
		this.speed = 0;
		tire = new Tire(); 
		navi = true;	
		*/
	}
	
	public Car2(int speed) { //new Car(60); 가 호출
		this(speed, "현대");
		/*
		this.company = "현대"; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
		*/
	}
	
	public Car2(String company, int speed) { //new Car("삼성", 60); 가 호출
		this(speed, company);
		/*
		this.company = company; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
		*/
	}
	
	public Car2(int speed, String company) {
		this.company = company; 
		this.speed = speed;
		tire = new Tire(); 
		navi = true;
	}
	
	
	
	//Method
}
