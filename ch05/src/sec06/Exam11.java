package sec06;

public class Exam11 {

	public static void main(String[] args) {
		int[] scores = {95, 80, 97};
		
		//���� for�� : �迭 �� �÷��ǿ�����
		for(int score : scores) { //������ ������ : �迭 ������
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
