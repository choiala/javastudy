package sec06;

public class Exam09 {

	public static void main(String[] args) {
		int[][] scores = {
				{90,80},
				{95,85,75}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.println("score[" + i + "]["+ j +"]:" + scores[i][j]);
			}
		}

	}

}
