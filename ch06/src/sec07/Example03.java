package sec07;

public class Example03 {

	public static void main(String[] args) {
		
		//Korean k1 = new Korean(); //��ü ���� �Ұ�, �����ڸ� �ۼ��ؼ� �⺻������ ���� X
		Korean k1 = new Korean("ȫ�浿","123456-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("���ڹ�","123457-1234567");

	}

}
