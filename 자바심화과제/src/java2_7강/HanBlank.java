package java2_7강;

public class HanBlank {

    public static void main(String[] args) { // 메인
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15)); // 메서드에 값 전달후 출력 개행
        System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15)); // 메서드에 값 전달후 출력 개행
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글aa", 15)); // 메서드에 값 전달후 출력 개행
        System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15)); // 메서드에 값 전달후 출력 개행
        System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa")); // 메서드에 값 전달후 출력 개행
    }

    public static String HanBlankForeword(String kopo11_str, int kopo11_num) { // 파라미터 2개 받는 메서드
    	int kopo11_leng = 0; // 초기값 0 변수 선언
        String kopo11_Foreword = ""; // 빈 String 변수 선언
        for (char kopo11_i : kopo11_str.toCharArray()) { // str의 단어를 쪼개서 반복으로 빼보는 반복문
        	kopo11_leng += String.valueOf(kopo11_i).getBytes().length; // 문자의 byte길이를 측정하여 leng에 누적 더하기
        }
        for (int kopo11_i = 0; kopo11_i < kopo11_num-kopo11_leng; kopo11_i++) { // 0 ~ num - leng 만큼 도는 반복문
        	kopo11_Foreword = kopo11_Foreword + " "; // 변수에 반복으로 for문 값 만큼 공백 찍기
		}
        kopo11_Foreword = kopo11_Foreword + kopo11_str; // 변수에 str값 붙이기
        
        return kopo11_Foreword; // 변수 값 리턴
    }

    public static String HanBlankBackword(String kopo11_str, int kopo11_num) { // 파라미터 2개 받는 메서드
    	int kopo11_leng = 0; // 초기값 0 변수 선언
    	String kopo11_Backword = ""; // 빈 String 변수 선언
        
        for (char kopo11_i : kopo11_str.toCharArray()) { // str의 단어를 쪼개서 반복으로 빼보는 반복문
        	kopo11_leng += String.valueOf(kopo11_i).getBytes().length; // 문자의 byte길이를 측정하여 leng에 누적 더하기
        }
        kopo11_Backword = kopo11_Backword + kopo11_str; // 0 ~ num - leng 만큼 도는 반복문
        for (int kopo11_i = 0; kopo11_i < kopo11_num - kopo11_leng; kopo11_i++) { // 0 ~ num - leng 만큼 도는 반복문
        	kopo11_Backword = kopo11_Backword + " "; // 변수에 반복으로 for문 값 만큼 공백 찍기
        }
        return kopo11_Backword; // 변수 값 리턴

    }

    public static int HanCount(String kopo11_str) { // 파라미터 1개 받는 메서드
        int kopo11_hanCount = 0; // 초기값 0 변수 선언
        for (char kopo11_i : kopo11_str.toCharArray()) { // str의 단어를 쪼개서 반복으로 빼보는 반복문
        	if(String.valueOf(kopo11_i).getBytes().length == 2) { // 값이 2가 true가 되면
        		kopo11_hanCount++; // 1더하기
        	}
        }
        return kopo11_hanCount; // 변수 값 리턴

    }

}
