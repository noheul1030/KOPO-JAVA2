package java2_7��;

public class HanBlank {

    public static void main(String[] args) {
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15));
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
        System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ�aa"));
    }

    public static String HanBlankForeword(String str, int num) {
        String Foreword = "";
        for (int i = 0; i < num - str.length(); i++) {
            Foreword = Foreword + " ";
        }
        Foreword = Foreword + str;
        return Foreword;
    }

    public static String HanBlankBackword(String str, int num) {
        String Backword = "";
        Backword.concat(str);
        for (int i = 0; i < num - str.length(); i++) {
            Backword.concat(" ");
        }
        return Backword;

    }

    public static int HanCount(String str) {
        int hanCount;
        return 0;

    }

}
