package java2_2��3��;

public class StringEx {

	public static void main(String[] args) {
		String kopo11_name = "Ja" + "va"; // String Ÿ�� �迭�� "Ja" + "va" �� �Է� = "Java"
		String kopo11_str = kopo11_name + 8.0; // String Ÿ�� �迭�� "Java" + 8.0 �� �Է� = "Java8.0"

		System.out.println(kopo11_name); // "Java" ���
		System.out.println(kopo11_str); // "Java8.0" ���
		System.out.println(7 + " ");	// 7 ���
		System.out.println(" " + 7);	// ��ĭ��� 7���
		System.out.println(7 + "");		// 7���
		System.out.println("" + 7);		// 7���
		System.out.println("" + "");	// ��ĭ ���
		System.out.println(7 + 7 + "");		// 7+7 = 14 ��� int ������ ���
		System.out.println("" + 7 + 7);		// ""��ĭ�� String Ÿ������ ����ϰ� 7+7 = 77 ���

	}

}