package sec06;

public class Exam11 {

	public static void main(String[] args) {
		int[] scores = {95, 80, 97};
		
		//향상된 for문 : 배열 및 컬렉션에서만
		for(int score : scores) { //저장할 변수명 : 배열 변수명
			System.out.println(score);
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		double avg = (double)sum / scores.length;
		
		String[] names = {"Java", "Python", "TensorFlow"};
		for(String name : names) {
			System.out.println(name);
			if(name.contentEquals("Python")) {
				break;
			}
		}

	}

}
