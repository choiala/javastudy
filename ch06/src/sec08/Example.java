package sec08;

public class Example {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		//메소드 호출
		myCalc.print();
		myCalc.print("추웡 개추웡");
		myCalc.print("목요일",-7);
		
		byte b1 = 3;
		int result = myCalc.plus(b1, 5); //결과값 받기 // byte타입을 넣어도 됨(int보다 작으니까)
		System.out.println("result:" + result);
		
		long var1 = 3;
		int result00 = myCalc.plus((int)var1, 5);//long 받으려면 강제 타입변환 필요
		
		String result2 = myCalc.join("으앙", "000");
		System.out.println("result2:" + result2);
		
		int[] scores = {90, 80, 90};
		int result3 = myCalc.sum(scores);
		System.out.println(result3);
		
		//int result4 = myCalc.sum2(scores);
		int result4 = myCalc.sum2(90, 80, 90); //메소드 매개변수가 ...일 때 주고싶은대로 줄 수 있음 → 배열로 만들어짐
		System.out.println(result4);
		
		Car myCar = new Car();
		//myCar.speed = -10; //private 붙어서 speed 쓸 수 없음
		myCar.setSpeed(-10); //참조변수를 통해서 호출해야함
		myCar.run(100); 
		
		

	}

}
