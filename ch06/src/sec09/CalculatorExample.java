package sec09;

public class CalculatorExample {

	public static void main(String[] args) {

		//바람직한 코드
		double area1 = 5 * 5 * Calculator.pi;
		double area2 = Calculator.circleArea(5);
		System.out.println(area1);
		System.out.println(area2);
		
		//바람직하지 않은 코드
		Calculator calc = new Calculator();
		double area3 = 5 * 5 *calc.pi;
		double area4 = calc.circleArea(5);
		System.out.println(area3);
		System.out.println(area4);
	}

}
