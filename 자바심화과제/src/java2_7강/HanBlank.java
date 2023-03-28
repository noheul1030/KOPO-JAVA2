package java2_7강;

public class HanBlank {

    public static void main(String[] args) {
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15));
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));
        System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
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
