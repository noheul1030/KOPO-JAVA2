package java2_6강;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class 성적집계표 {

	public static void main(String[] args) {
//		InputData input = new InputData(0);
		Test test = new Test();
		test.time();
		test.print();

	}

}

class Test{
	
	String time ;
	public void time() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.M.dd HH:mm:ss");
		time = sdf.format(new Date());
	}
	
	public void print() {
		System.out.printf("%25s\n","성적집계표");
		System.out.printf("\n");
		System.out.printf("%55s\n","출력일자 : "+time);
		System.out.printf("==============================================================\n");
		
	}
}
