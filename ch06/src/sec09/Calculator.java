package sec09;

public class Calculator {
	//Field
	String company;
	static double pi = 3.14159; //객체마다 동일한 값은 static 붙여도 됨
	double memory;
	
	//Constructor
	
	//Method
	static double circleArea(double r) {
		double area = r * r *pi; //static은 this. 못씀
		return area;
	}
	
	double circleArea2(double r) {
		double area = r * r *this.pi;
		return area;
	}
	
	void setMemory(double r) { //memory때문에 객체를 만들고 나서 사용해야함
		double result = circleArea(r);
		this.memory = result;
	}
	
	static void method1() { //필드 사용 안함, 메소드 사용 안함 -> static 붙여라
		String name = "홍길동";
		int round = 3;
		System.out.println("날씨가 추워요");
	}
	
	void method2() {
		//String company = "삼성"; //변수임
		this.company = "삼성";
		this.setMemory(10);
		System.out.println("날씨가 추워요");
	}
	
}
