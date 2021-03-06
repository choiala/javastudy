package sec06;

public class Exam10 {

	public static void main(String[] args) {
		/*
		 * String[][] boards = { {"1","제목1","내용1","글쓴이1"}, {"2","제목2","내용2","글쓴이2"},
		 * null, null, null };
		 */
		
		String[][] boards = new String[100][4]; //100개 저장 가능
		
		//새로운 게시물 저장
		boards[0] = new String[] {"1","제목1","내용1","글쓴이1"};
		boards[1] = new String[] {"2","제목2","내용2","글쓴이2"};
		boards[2] = new String[] {"3","제목3","내용3","글쓴이3"};
		
		//2번 게시물 삭제 1
		// boards[1] = null; //참조 끊기
		/*boards[1][0] = null; 
		boards[1][1] = null;
		boards[1][2] = null;
		boards[1][3] = null;*/
		//2번 게시물 삭제 2
		boards[1] = new String[] {null, null, null, null};
		
		//게시물 수정
		String newTitle = "날씨";
		String newContent = "추워요";
		boards[0][1] = newTitle;
		boards[0][2] = newContent;
		
		//게시물 목록 보기
		System.out.println("-------------------------");
		for(int i=0; i<boards.length; i++) {			
			if(boards[i][0] != null) {
				for(int j=0; j<boards[i].length; j++) {
					System.out.print(boards[i][j] + " | ");
				}
				System.out.println();
			}
			
		}
		System.out.println("-------------------------");
	}

}
