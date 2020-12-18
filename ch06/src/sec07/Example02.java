package sec07;

public class Example02 {

	public static void main(String[] args) {


		String str1 = "ABC";
		
		String str2 = new String("ABC");
		
		byte[] arr1 = {65,66,67};
		System.out.println(arr1); //65,66,67이 출력되게 하려면?
		String str3 = new String(arr1);
		System.out.println(str3); //왜 ABC가 나오지?
		
		char[] arr2 = {'A','B','C'}; //문자는 문자열에 넣을 수 있다는 소리? 자바 문서에 String 부분 볼 것
		String str4 = new String(arr2);
		
		//int[] arr3 = {65,66,67}; //String은 int못넣음
		//String str5 = new String(arr3); //어떤생성자를 넣어서 객체를 만들 수 있는지는 document참고

	}

}
