package java2_6��;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ��������ǥ {

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
		System.out.printf("%25s\n","��������ǥ");
		System.out.printf("\n");
		System.out.printf("%55s\n","������� : "+time);
		System.out.printf("==============================================================\n");
		
	}
}
