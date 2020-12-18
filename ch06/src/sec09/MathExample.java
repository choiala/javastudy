package sec09;

public class MathExample {

	public static void main(String[] args) {
		double r = 5;
		double area = r * r * Math.PI; // Math class¿« PI
		double area2 = Math.pow(r, 2) * Math.PI;
		System.out.println(area);
		System.out.println(area2);
		
		double value = 12.345;
		long result = Math.round(value);
		System.out.println(result);

	}

}
