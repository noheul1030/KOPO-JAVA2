package JSON.kopo11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONMain2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser kopo11_parser = new JSONParser(); // JSONParser 객체 생성

		// 해당경로의 파일 FileReader로 읽기 
		Object kopo11_obj = kopo11_parser.parse(new FileReader("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\XMLProject\\jsontest.json"));

		JSONArray kopo11_array = (JSONArray) kopo11_obj; // JSONArray에 FileReader로 읽은 Object값 대입 

		System.out.println("********************************"); // ******* 출력 개행
		for (int kopo11_i = 0; kopo11_i < kopo11_array.size(); kopo11_i++) { // kopo11_array의 크기만큼 도는 반복문
			JSONObject kopo11_result = (JSONObject) kopo11_array.get(kopo11_i); // kopo11_result 변수에 kopo11_array.get(i) 값 대입 
			System.out.println("이름 : " + kopo11_result.get("name")); // kopo11_result의 get "name" print
			System.out.println("학번 : " + kopo11_result.get("studentid")); // kopo11_result의 get "studentid" print

			JSONArray kopo11_score = (JSONArray) kopo11_result.get("score"); // kopo11_score 변수에 kopo11_result의 get "score" 값 대입 
			long kopo11_kor = (long) kopo11_score.get(0); // kopo11_kor 변수에 long 형태의  kopo11_score.get(0) 값 대입
			long kopo11_eng = (long) kopo11_score.get(1); // kopo11_eng 변수에 long 형태의  kopo11_score.get(0) 값 대입
			long kopo11_mat = (long) kopo11_score.get(2); // kopo11_mat 변수에 long 형태의  kopo11_score.get(0) 값 대입
			System.out.println("국어 : " + kopo11_kor); // kopo11_kor 값 print
			System.out.println("영어 : " + kopo11_eng); // kopo11_eng 값 print
			System.out.println("수학 : " + kopo11_mat); // kopo11_mat 값 print
			System.out.println("총점 : " + (kopo11_kor + kopo11_eng + kopo11_mat)); // 점수 총합 print
			System.out.println("평균 : " + ((kopo11_kor + kopo11_eng + kopo11_mat) / 3.0)); // 점수 총합 / 3.0 평균 값 print
			System.out.println("********************************"); // ******* 출력 개행
		}
	}
}
