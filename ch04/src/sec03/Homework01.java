package sec03;

public class Homework01 {

	public static void main(String[] args) {
		// 다음을 출력하는 코드 작성 1
		/*
		^
		^^
		^^^
		^^^^
		^^^^^
		*/
				
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("^");
			}
			System.out.println();	
		}*/
		

		// 다음을 출력하는 코드 작성 2
		/*
		^^^^^
		^^^^
		^^^
		^^
		^
		*/		
		
		for(int n=1; n<=5; n++) {
			for(int m=5; m>=n; m--) { // 5부터 시작해서; m이 n보다 크거나 같을 때까지; 1씩 줄여라
				System.out.print("^");
			}
			System.out.println();	
		}
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("^");
			}
			System.out.println();	
		}
		
		
		
		// 다음을 출력하는 코드 작성 3
		/*
		^^^^^
		 ^^^^
		  ^^^
		   ^^
		    ^
		*/
		for(int a=0; a<5; a++) {
			for(int c=0; c<a; c++) {
				System.out.print(" ");
			}
			for(int b=5; b>a; b--) {
				System.out.print("^");
			}
			System.out.println();
		}

	}
}
