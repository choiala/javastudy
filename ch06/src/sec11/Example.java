package sec11;

public class Example {

	public static void main(String[] args) {
		//Korean.nation = "�̱�"; //final�̶� �� �ٲ� �� ����
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234657");
		System.out.println(k1.ssn);
		
		//k1.ssn = "654321-7654321"; //�� �� ���� �ο��Ǹ� �ٲ� �� ����

	}

}
