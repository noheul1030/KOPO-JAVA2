package java2_7��;

public class HanBlank {

    public static void main(String[] args) { // ����
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15)); // �޼��忡 �� ������ ��� ����
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15)); // �޼��忡 �� ������ ��� ����
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15)); // �޼��忡 �� ������ ��� ����
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15)); // �޼��忡 �� ������ ��� ����
        System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa")); // �޼��忡 �� ������ ��� ����
    }

    public static String HanBlankForeword(String kopo11_str, int kopo11_num) { // �Ķ���� 2�� �޴� �޼���
    	int kopo11_leng = 0; // �ʱⰪ 0 ���� ����
        String kopo11_Foreword = ""; // �� String ���� ����
        for (char kopo11_i : kopo11_str.toCharArray()) { // str�� �ܾ �ɰ��� �ݺ����� ������ �ݺ���
        	kopo11_leng += String.valueOf(kopo11_i).getBytes().length; // ������ byte���̸� �����Ͽ� leng�� ���� ���ϱ�
        }
        for (int kopo11_i = 0; kopo11_i < kopo11_num-kopo11_leng; kopo11_i++) { // 0 ~ num - leng ��ŭ ���� �ݺ���
        	kopo11_Foreword = kopo11_Foreword + " "; // ������ �ݺ����� for�� �� ��ŭ ���� ���
		}
        kopo11_Foreword = kopo11_Foreword + kopo11_str; // ������ str�� ���̱�
        
        return kopo11_Foreword; // ���� �� ����
    }

    public static String HanBlankBackword(String kopo11_str, int kopo11_num) { // �Ķ���� 2�� �޴� �޼���
    	int kopo11_leng = 0; // �ʱⰪ 0 ���� ����
    	String kopo11_Backword = ""; // �� String ���� ����
        
        for (char kopo11_i : kopo11_str.toCharArray()) { // str�� �ܾ �ɰ��� �ݺ����� ������ �ݺ���
        	kopo11_leng += String.valueOf(kopo11_i).getBytes().length; // ������ byte���̸� �����Ͽ� leng�� ���� ���ϱ�
        }
        kopo11_Backword = kopo11_Backword + kopo11_str; // 0 ~ num - leng ��ŭ ���� �ݺ���
        for (int kopo11_i = 0; kopo11_i < kopo11_num - kopo11_leng; kopo11_i++) { // 0 ~ num - leng ��ŭ ���� �ݺ���
        	kopo11_Backword = kopo11_Backword + " "; // ������ �ݺ����� for�� �� ��ŭ ���� ���
        }
        return kopo11_Backword; // ���� �� ����

    }

    public static int HanCount(String kopo11_str) { // �Ķ���� 1�� �޴� �޼���
        int kopo11_hanCount = 0; // �ʱⰪ 0 ���� ����
        for (char kopo11_i : kopo11_str.toCharArray()) { // str�� �ܾ �ɰ��� �ݺ����� ������ �ݺ���
        	if(String.valueOf(kopo11_i).getBytes().length == 2) { // ���� 2�� true�� �Ǹ�
        		kopo11_hanCount++; // 1���ϱ�
        	}
        }
        return kopo11_hanCount; // ���� �� ����

    }

}
